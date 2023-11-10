package application;

import db.DataBaseConfig;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        try{
            conn = DataBaseConfig.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int row1 = st.executeUpdate("update seller set BaseSalary = 2090 where DepartmentId = 1");
            //int x = 1;
            //if(x < 2){
            //    throw new SQLException("Fake error");
            //}
            int row2 = st.executeUpdate("update seller set BaseSalary = 3090 where DepartmentId = 2");

            conn.commit();

            System.out.println("rowns1 " + row1);
            System.out.println("rowns2 " + row2);

        }catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Error trying to rollback! Caused by: " + ex.getMessage());
            }
        }finally {
            DataBaseConfig.closeStatement(st);
            DataBaseConfig.closeConnection();
        }
    }
}