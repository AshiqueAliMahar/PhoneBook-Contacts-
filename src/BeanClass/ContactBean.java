package BeanClass;

public class ContactBean {

    private int id;
    private String Name;
    private String Number;
    private int TypeId;
    private String ContactType;

    public ContactBean(int id, String Name, String Number, String ContactType,int TypeId) {
        this.id = id;
        this.Name = Name;
        this.Number = Number;
        this.TypeId = TypeId;
        this.ContactType = ContactType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    public int getTypeId() {
        return TypeId;
    }

    public void setTypeId(int TypeId) {
        this.TypeId = TypeId;
    }

    public String getContactType() {
        return ContactType;
    }

    public void setContactType(String ContactType) {
        this.ContactType = ContactType;
    }

}
