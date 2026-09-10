// מחלקה לייצוג מיקום/עיר - נוספה כדי לתאום את מסמך העיצוב המשותף
public class Location {
    private String cityName;

    public Location(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public String toString() {
        return cityName;
    }
}