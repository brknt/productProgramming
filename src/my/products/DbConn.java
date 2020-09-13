package my.products;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Berkant
 */
public class DbConn {
    
        public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:productsDb.db");
            System.out.println("connected");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    

        
}
