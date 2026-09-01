public class RentalSystem {
    private static User[] users = new User[100];
    private static int userCount = 0;

    private static Car[] cars = new Car[100];
    private static int carCount = 0;

    private static Order[] orders = new Order[100];
    private static int orderCount = 0;

    private static Location[] locations = new Location[100];
    private static int locationCount = 0;

    // --- Users ---
    public static void addUser(User user) {
        if (user == null) {
            System.out.println("Error: Cannot add a null user.");
            return;
        }
        if (userCount < users.length) {
            users[userCount] = user;
            userCount++;
            System.out.println("User added successfully: " + (user.getName() != null ? user.getName() : "N/A"));
        } else {
            System.out.println("Error: User database is full!");
        }
    }

    public static void printAllUsers() {
        System.out.println("--- System Users ---");
        for (int i = 0; i < userCount; i++) {
            if (users[i] != null) {
                System.out.println(users[i]);
            }
        }
    }

    // --- Cars ---
    public static void addCar(Car car) {
        if (car == null) {
            System.out.println("Error: Cannot add a null car.");
            return;
        }
        if (carCount < cars.length) {
            cars[carCount] = car;
            carCount++;
            System.out.println("Car added successfully: " + (car.getModel() != null ? car.getModel() : "N/A"));
        } else {
            System.out.println("Error: Car database is full!");
        }
    }

    public static void printAllCars() {
        System.out.println("--- System Cars ---");
        for (int i = 0; i < carCount; i++) {
            if (cars[i] != null) {
                System.out.println(cars[i]);
            }
        }
    }

    // --- Locations ---
    public static void addLocation(Location location) {
        if (location == null) {
            System.out.println("Error: Cannot add a null location.");
            return;
        }
        if (locationCount < locations.length) {
            locations[locationCount] = location;
            locationCount++;
            System.out.println("Location added successfully: " + (location.getName() != null ? location.getName() : "N/A"));
        } else {
            System.out.println("Error: Location database is full!");
        }
    }

    public static void printAllLocations() {
        System.out.println("--- System Locations ---");
        for (int i = 0; i < locationCount; i++) {
            if (locations[i] != null) {
                System.out.println(locations[i]);
            }
        }
    }

    // --- Orders ---
    public static void addOrder(Order order) {
        if (order == null) {
            System.out.println("Error: Cannot add a null order.");
            return;
        }
        if (orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
            System.out.println("Order added successfully: ID " + order.getOrderId());
        } else {
            System.out.println("Error: Order database is full!");
        }
    }

    public static void printAllOrders() {
        System.out.println("--- System Orders ---");
        for (int i = 0; i < orderCount; i++) {
            if (orders[i] != null) {
                System.out.println(orders[i]);
            }
        }
    }
}