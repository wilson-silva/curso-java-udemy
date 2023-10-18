package application;

import db.DataBaseConfig;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DataBaseConfig.getConnection();
            /*
            String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?);";

            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, "Carl Purple");
            st.setString(2, "carl@gmail.com");
            st.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));
            st.setDouble(4, 3000.00);
            st.setInt(5, 4);
            */
            st = conn.prepareStatement("insert into department (name) values ('D1'), ('D2')",
                    Statement.RETURN_GENERATED_KEYS);

            int rowAffected = st.executeUpdate();
            if (rowAffected > 0) {
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            } else {
                System.out.println("No row affected!");
            }
            System.out.println("Done! Rows affected: " + rowAffected);
        } catch (SQLException /*| ParseException */ e) {
            e.printStackTrace();
        } finally {
            DataBaseConfig.closeStatement(st);
            DataBaseConfig.closeConnection();
        }
    }
}