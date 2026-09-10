// מחלקת הזמנה - מוגדרת לפי מסמך העיצוב המשותף למערכת
public class Order {
    private int orderId;
    private int userId;
    private String licensePlate;

    public Order(int orderId, int userId, String licensePlate) {
        this.orderId = orderId;
        this.userId = userId;
        this.licensePlate = licensePlate;
    }

    public int getOrderId() { return orderId; }
    public int getUserId() { return userId; }
    public String getLicensePlate() { return licensePlate; }
}