package jdbc;

import java.sql.*;

public class demo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/login";
        String user="root";
        String password="20021223";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is successfully!");

            /*Statement stm=conn.createStatement();
            int kq=stm.executeUpdate("insert into  account values('dthanh3','abc1234')");
            System.out.println("Ket qua chen: "+kq);*/

            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from account");

            while(rs.next()){
                String username=rs.getString("username");
                String pwd=rs.getString("pwd");
                System.out.printf("%s - %s\n",username,pwd);
            }
            System.out.println("Connection is successfully!");
            stm.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
