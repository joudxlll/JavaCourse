package day4;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\dev\\IdeaProjects\\JavaCourse\\src\\main\\java\\day4\\hr.db";
        String query = "Select * from departments where location_id = 1700";

        try(Connection conn= DriverManager.getConnection(url);) {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                Department d=new Department(rs);
                System.out.println(d); //toString
//                int depId = rs.getInt(1);
//                String depName = rs.getString(2);
//                System.out.println(depId + ", "+ depName);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
