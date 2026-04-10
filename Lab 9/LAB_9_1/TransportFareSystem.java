package LAB_9_1;

public class TransportFareSystem {
    public static void main(String[] args) {
        // Creating Bus and Taxi objects
        Transport bus = new Bus("BUS123", 15.0);
        Transport taxi = new Taxi("TAXI456", 10.0);

        // Displaying details
        System.out.println("=== Bus Details ===");
        bus.displayDetails();

        System.out.println("\n=== Taxi Details ===");
        taxi.displayDetails();
    }
}