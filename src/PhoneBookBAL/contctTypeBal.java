
package PhoneBookBAL;

import BeanClass.ContactTypes;
import connetion.connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class contctTypeBal {
    
    public ArrayList<ContactTypes> getCntctTypes(){
        
        ArrayList<ContactTypes> arrlst=new ArrayList<ContactTypes>();
        try {
            String query="SELECT ID,TYPE FROM contacttype;";
            Connection con=connect.getcon();
            Statement stat=con.createStatement();
            ResultSet rs = stat.executeQuery(query);
            while(rs.next()){
                
                ContactTypes cType=new ContactTypes(rs.getInt(1),rs.getString(2));
                arrlst.add(cType);
                
            }          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Get contact ztypes Method");
        }
        return arrlst;
        
    }
    
}
