import java.util.Scanner;

public class BookMyStayApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("\n===== Welcome to BookMyStay =====");
            System.out.println("1. Search Hotels");
            System.out.println("2. Book Room");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    searchHotels(scanner);
                    break;

                case 2:
                    bookRoom(scanner);
                    break;

                case 3:
                    viewBooking(scanner);
                    break;

                case 4:
                    System.out.println("Thank you for using BookMyStay!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    // Use Case 1: Search Hotels
    private static void searchHotels(Scanner scanner) {
        System.out.print("Enter city: ");
        String city = scanner.nextLine();

        System.out.println("Searching hotels in " + city + "...");
        System.out.println("1. Grand Palace Hotel");
        System.out.println("2. Sea View Resort");
        System.out.println("3. Budget Inn");
    }

    // Use Case 2: Book Room
    private static void bookRoom(Scanner scanner) {
        System.out.print("Enter hotel name: ");
        String hotel = scanner.nextLine();

        System.out.print("Enter number of rooms: ");
        int rooms = scanner.nextInt();

        System.out.println("Booking confirmed at " + hotel + " for " + rooms + " room(s).");
    }

    // Use Case 3: View Booking
    private static void viewBooking(Scanner scanner) {
        System.out.print("Enter booking ID: ");
        String bookingId = scanner.nextLine();

        System.out.println("Booking Details for ID: " + bookingId);
        System.out.println("Hotel: Grand Palace");
        System.out.println("Rooms: 2");
        System.out.println("Status: Confirmed");
    }
}