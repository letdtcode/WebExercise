package conn;
import org.hibernate.internal.build.AllowSysOut;

import java.sql.*;
public class MySQLConnection {
    public static Connection initializeDatabase() throws SQLException, ClassNotFoundException
    {
        String dbDriver="com.mysql.cj.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306";
        String dbName="login";
        String dbUsername="root";
        String dbPassword="20021223";
        String connectionURL=dbURL + ";databaseName=" + dbName;
        Connection conn=null;
        try{
            Class.forName(dbDriver);
            conn=DriverManager.getConnection(connectionURL,dbUsername,dbPassword);
            System.out.println("connection successfully!");
        } catch (Exception ex){
            System.out.println("connection failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
