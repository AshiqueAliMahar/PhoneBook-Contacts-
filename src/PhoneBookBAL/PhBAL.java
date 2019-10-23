
package PhoneBookBAL;

import BeanClass.ContactBean;
import connetion.connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PhBAL {
    
    ContactBean cBean=null;
    
    public ArrayList<ContactBean> getContacts(){
        
        ArrayList<ContactBean> arr=new ArrayList<ContactBean>();
        
        try {
            String query="SELECT c.ID,NAME,Number,typeId,t.Type FROM contact c INNER JOIN contacttype t ON (typeId=t.ID)";
            
            ResultSet rs=getconnection().executeQuery(query);
            while(rs.next()){
                cBean=new ContactBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getInt(4));
                arr.add(cBean);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Get All Contacts"+ex.getMessage());
        }
        return  arr;
    }
    public Statement getconnection(){
        
        Connection con =connect.getcon();
        Statement stat=null;
        try {
            stat=con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return stat;
        
        
    }
    
    public void insertContact(String name,String number,int id){
        
        try {
            String query="INSERT INTO contact(NAME,Number,typeId)VALUES ('"+name+"','"+number+"',"+id+")";
            getconnection().executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problem in Inserting Data PhBal");
        }
        
    }
    public void updateData(int cId,String name,String number,int id){
        try {
            String query="UPDATE contact SET NAME = '"+name+"',Number = '"+number+"',typeId = '"+id+"' WHERE `ID` = '"+cId+"'";
            int chk=getconnection().executeUpdate(query);
            if(chk>0){
                JOptionPane.showMessageDialog(null,"Successfully Updated");
            }else
                JOptionPane.showMessageDialog(null,"UnSuccessful");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problem in Updating Data PhBal");
        }
    }
    public void deleteData(int id){
        
        try {
            String query="DELETE FROM contact WHERE `ID` ="+id+"";
            int chk=getconnection().executeUpdate(query);
            if(chk>0){
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }else
                JOptionPane.showMessageDialog(null,"UnSuccessful");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Problem in Deleting Data PhBal");
        }
        
    }
    public ArrayList<ContactBean> searchName(String name){
        
        ArrayList<ContactBean> arrlst=new ArrayList<ContactBean>();
        try {
            String query="SELECT c.ID,NAME,Number,typeId,t.Type FROM contact c INNER JOIN contacttype t ON (typeId=t.ID) WHERE NAME LIKE '%"+name+"%'";
            Statement stat = getconnection();
            ResultSet rs=stat.executeQuery(query);
            
            
            while(rs.next()){
                
                cBean=new ContactBean(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(5),rs.getInt(4));
                arrlst.add(cBean);
                
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Phone Bal Searching ");
        }
        
        return  arrlst;
    }
}
