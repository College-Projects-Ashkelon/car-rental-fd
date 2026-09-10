public class RentalSystem {
    // קבועים בעלי שם כדי להימנע מ"מספרי קסם" (Magic Numbers)
    public static final double NO_PRICE_LIMIT = -999.0;
    public static final String BYPASS_FILTER = "any";
    private static final int DEFAULT_OWNER_ID = 999;

    private Car[] cars;
    private User currentUser;
    private int carCount = 0;

    public RentalSystem(int maxCars) {
        this.cars = new Car[maxCars];
        this.currentUser = null;
    }

    // התחברות משתמש למערכת
    public void login(User user) {
        this.currentUser = user;
        System.out.println(">>> Login successful: " + user.getName() + " (" + user.getRole() + ")");
    }

    // ---------------------------------------------------------
    // KAN 353 & 354: Search Cars with Smart Filtering
    // ---------------------------------------------------------
    // פונקציה המבצעת סינון חכם לפי מחיר, עיר וסוג דלק.
    // תומכת בערכי מעקף (Bypass) כמו NO_PRICE_LIMIT למספרים או "any" למחרוזות.
    public void searchCars(double maxPrice, String cityFilter, String fuelFilter) {
        System.out.println("\n=== SEARCH RESULTS ===");
        System.out.println("Filters: MaxPrice=" + (maxPrice == NO_PRICE_LIMIT ? "Any" : maxPrice) +
                ", City=" + cityFilter + ", Fuel=" + fuelFilter);

        boolean foundAny = false;

        // AC1 (KAN 353): לולאה רצה רק עד ל-carCount (לא עד סוף המערך הפיזי)
        for (int i = 0; i < carCount; i++) {
            Car car = cars[i];

            // תנאי מקדים: הרכב חייב להיות פנוי (AC1 KAN 352)
            if (!car.isAvailable()) {
                continue;
            }

            // --- לוגיקת הסינון החכם (KAN 354) ---

            // 1. סינון מחיר: בדיקה אם הועבר ערך מעקף OR המחיר של הרכב קטן/שווה למקסימום
            boolean priceMatch = (maxPrice == NO_PRICE_LIMIT) || (car.getPricePerDay() <= maxPrice);

            // 2. סינון עיר: השוואה לא רגישה לאותיות גדולות/קטנות (equalsIgnoreCase)
            boolean cityMatch = cityFilter.equalsIgnoreCase(BYPASS_FILTER) ||
                    cityFilter.isEmpty() ||
                    car.getCity().equalsIgnoreCase(cityFilter);

            // 3. סינון דלק: אותו עיקרון כמו לעיר
            boolean fuelMatch = fuelFilter.equalsIgnoreCase(BYPASS_FILTER) ||
                    fuelFilter.isEmpty() ||
                    car.getFuelType().equalsIgnoreCase(fuelFilter);

            // אם כל התנאים מתקיימים, מדפיסים את הרכב
            if (priceMatch && cityMatch && fuelMatch) {
                // AC3 (KAN 352): שימוש ב-toString להצגה אסתטית
                System.out.println(car.toString());
                foundAny = true;
            }
        }

        // טיפול במקרה שלא נמצאו תוצאות (AC2 KAN 352)
        if (!foundAny) {
            System.out.println("No vehicles found matching the search criteria.");
        }
        System.out.println("========================\n");
    }

    // מתודת עזר להוספת רכבים לבדיקה
    public void addTestCar(String plate, double price, String cityName, String fuel) {
        if (carCount < cars.length) {
            Location loc = new Location(cityName);
            cars[carCount] = new Car(plate, DEFAULT_OWNER_ID, price, loc, fuel);
            carCount++;
        }
    }

    // מתודה לשינוי זמינות רכב (משמשת לבדיקת סינון רכבים תפוסים)
    public void setCarAvailability(int index, boolean available) {
        if (index >= 0 && index < carCount) {
            cars[index].setAvailable(available);
        }
    }
}