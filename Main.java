public class Main {
    public static void main(String[] args) {
        User u1 = new User(1, "Omer", "omer@mail.com", "pass123", "Customer");
        Car c1 = new Car("123-45-678", "Mazda 3", 2023, 150.0, true);
        Location l1 = new Location(101, "Tel Aviv Central", "HaShalom 1, Tel Aviv");
        Order o1 = new Order(5001, 1, "123-45-678", 600.0);

        RentalSystem.addUser(u1);
        RentalSystem.addCar(c1);
        RentalSystem.addLocation(l1);
        RentalSystem.addOrder(o1);

        System.out.println();

        RentalSystem.printAllUsers();
        RentalSystem.printAllCars();
        RentalSystem.printAllLocations();
        RentalSystem.printAllOrders();
    }
}