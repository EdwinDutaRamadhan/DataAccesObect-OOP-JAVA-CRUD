package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserConnection {
    //Design Pattern Singleton for Connection Secure 
    private static UserConnection instance = new UserConnection();
    private static Connection conn;
    public static UserConnection getInstance(){
        return instance;
    }
    public static Connection getConnection(){
        return conn;
    }
    private UserConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
