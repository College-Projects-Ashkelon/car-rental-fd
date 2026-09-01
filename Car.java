public class Car {
    private String licensePlate;
    private String model;
    private int year;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String licensePlate, String model, int year, double pricePerDay, boolean isAvailable) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licensePlate='" + (licensePlate != null ? licensePlate : "N/A") + '\'' +
                ", model='" + (model != null ? model : "N/A") + '\'' +
                ", year=" + year +
                ", pricePerDay=" + pricePerDay +
                ", isAvailable=" + isAvailable +
                '}';
    }
}