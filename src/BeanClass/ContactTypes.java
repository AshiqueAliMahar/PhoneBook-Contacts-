
package BeanClass;

public class ContactTypes {
    
    private int Id;
    private String ContctType;

    public ContactTypes(int Id, String ContctType) {
        this.Id = Id;
        this.ContctType = ContctType;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getContctType() {
        return ContctType;
    }

    public void setContctType(String ContctType) {
        this.ContctType = ContctType;
    }
    
    public String toString(){
        
        return ContctType;
        
    }
}
