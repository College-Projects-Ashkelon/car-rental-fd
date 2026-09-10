public class Car {
    private String licensePlate;
    private int ownerId;
    private double pricePerDay;
    private boolean isAvailable;

    // שימוש באובייקט Location במקום מחרוזת פשוטה לתאימות למסמך העיצוב
    private Location location;
    private String fuelType; // "Benzin", "Diesel", "Electric" וכו'

    public Car(String licensePlate, int ownerId, double pricePerDay, Location location, String fuelType) {
        this.licensePlate = licensePlate;
        this.ownerId = ownerId;
        this.pricePerDay = pricePerDay;
        this.location = location;
        this.fuelType = fuelType;
        this.isAvailable = true;
    }

    public String getLicensePlate() { return licensePlate; }
    public int getOwnerId() { return ownerId; }
    public double getPricePerDay() { return pricePerDay; }
    public boolean isAvailable() { return isAvailable; }

    public Location getLocation() { return location; }
    public String getCity() { return location != null ? location.getCityName() : ""; }
    public String getFuelType() { return fuelType; }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        String status = isAvailable ? "Available" : "Rented";
        // הצגה מעוצבת הכוללת את כל הפרטים הרלוונטיים לחיפוש (AC3 KAN 352)
        return "[" + licensePlate + "] City: " + getCity() +
                " | Fuel: " + fuelType +
                " | Price: $" + pricePerDay +
                " | Status: " + status;
    }
}