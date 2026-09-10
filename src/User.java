// מחלקת משתמש במערכת (לקוח או סוכן)
public class User {
    private int id;
    private String name;
    private String role; // "AGENT" או "CUSTOMER"

    public User(int id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getRole() { return role; }
}