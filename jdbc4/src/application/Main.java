package application;

import db.DataBaseConfig;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        try{
            conn = DataBaseConfig.getConnection();
            String sql = "update seller set BaseSalary = BaseSalary + ? where (DepartmentId = ?)";
            st = conn.prepareStatement(sql);
            st.setDouble(1, 200.0);
            st.setInt(2, 2);

            int rowAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowAffected);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            DataBaseConfig.closeStatement(st);
            DataBaseConfig.closeConnection();
        }
    }
}