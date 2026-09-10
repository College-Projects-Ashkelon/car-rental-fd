import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RentalSystem system = new RentalSystem(100);
        Scanner scanner = new Scanner(System.in);

        // הפעלת התחברות משתמש (שימוש במחלקת User ובמתודת login)
        User currentUser = new User(1, "Dimitri", "CUSTOMER");
        system.login(currentUser);

        // טעינת נתוני התחלה מגוונים לבדיקת הסינון
        system.addTestCar("AA-111-AA", 150.0, "Tel Aviv", "Benzin");
        system.addTestCar("BB-222-BB", 200.0, "Ashkelon", "Diesel");
        system.addTestCar("CC-333-CC", 300.0, "Ashkelon", "Electric");
        system.addTestCar("DD-444-DD", 180.0, "Haifa", "Benzin");
        system.addTestCar("EE-555-EE", 250.0, "Tel Aviv", "Electric");

        // סימון רכב אחד כמושכר לבדיקת תנאי הזמינות isAvailable()
        system.setCarAvailability(2, false); // CC-333-CC יהפוך ללא זמין

        System.out.println("=== CAR RENTAL SYSTEM - SEARCH MODULE (KAN 352-354) ===");

        while (true) {
            System.out.println("\n1. Run Advanced Search");
            System.out.println("0. Exit");
            System.out.print("Choose action: ");

            // ולידציה על הקלט - מונע קריסה בהזנת אותיות/טקסט
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number (0 or 1).");
                scanner.next(); // ניקוי ה-buffer
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting system. Goodbye!");
                break;
            } else if (choice == 1) {
                runSearchScenario(system, scanner);
            } else {
                System.out.println("Invalid choice. Please enter 0 or 1.");
            }
        }
        scanner.close();
    }

    // תרחיש בדיקה לחיפוש (מדמה הזנת פרמטרים על ידי משתמש)
    private static void runSearchScenario(RentalSystem system, Scanner scanner) {
        System.out.println("\n--- ENTER SEARCH CRITERIA ---");

        // קלט מחיר עם ולידציה למניעת קריסות
        System.out.print("Max Price per Day (enter -999 to ignore): ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid price format! Please enter a valid number.");
            scanner.next(); // ניקוי ה-buffer
            System.out.print("Max Price per Day (enter -999 to ignore): ");
        }
        double maxPrice = scanner.nextDouble();

        // קלט עיר
        System.out.print("City (enter 'any' to ignore): ");
        String city = scanner.next();

        // קלט סוג דלק
        System.out.print("Fuel Type (enter 'any' to ignore): ");
        String fuel = scanner.next();

        // ביצוע החיפוש במערכת
        system.searchCars(maxPrice, city, fuel);
    }
}