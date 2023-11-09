package application;

import db.DataBaseConfig;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DataBaseConfig.getConnection();
            String sql = "delete from department where id = ?";
            st = conn.prepareStatement(sql);
            st.setInt(1, 2);

            int rowAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);
        }catch (SQLException e){
            throw new DbIntegrityException(e.getMessage());
        }finally {
            DataBaseConfig.closeStatement(st);
            DataBaseConfig.closeConnection();
        }
    }
}