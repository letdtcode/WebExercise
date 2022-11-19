package dao;

import conn.DBConnect;
import entity.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;

    public Account checkLogin(String username, String password){
        try{
            String query="select * from account where username= ? and pwd= ?";
            conn=new DBConnect().getConnection();
            ps=conn.prepareStatement(query);
            ps.setString(1,username);
            ps.setString(2,password);
            rs=ps.executeQuery();
            while (rs.next()){
                Account a=new Account(username, password);
                return a;
            }
        }catch (Exception ex){
        }
        return null;
    }
}
