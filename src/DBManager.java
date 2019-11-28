
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto
 */
public class DBManager {
    public static Connection getConnection() throws SQLException{
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/javacontactapp","", "");
        }   
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            if(conn != null)
                conn.close();
        }
        return conn;
    }
}
