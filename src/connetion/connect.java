
package connetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connect {
    
    public static Connection getcon(){
        
       Connection con=null;
        try {
             Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Contacts","root","");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Connection Failed");
            System.exit(0);
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Driver Not loaded");
        }
        
        return  con;
    }
    

}
