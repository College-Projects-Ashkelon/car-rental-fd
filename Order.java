public class Order {
    private int orderId;
    private int userId;
    private String carLicensePlate;
    private double totalPrice;

    public Order(int orderId, int userId, String carLicensePlate, double totalPrice) {
        this.orderId = orderId;
        this.userId = userId;
        this.carLicensePlate = carLicensePlate;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCarLicensePlate() {
        return carLicensePlate;
    }

    public void setCarLicensePlate(String carLicensePlate) {
        this.carLicensePlate = carLicensePlate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", carLicensePlate='" + (carLicensePlate != null ? carLicensePlate : "N/A") + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}