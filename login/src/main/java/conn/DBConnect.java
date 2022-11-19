package conn;
import java.sql.*;

public class DBConnect {
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        return MySQLConnection.initializeDatabase();
    }
}
