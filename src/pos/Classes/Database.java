package pos.Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocky Shamsul Alam
 */
public class Database {
    
    public Connection con;
    
    public void dbConnect() {

        String url = "jdbc:mysql://localhost/dbPos";
        String username = "root";
        String password = "";

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
