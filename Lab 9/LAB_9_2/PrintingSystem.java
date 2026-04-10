package LAB_9_2;

public class PrintingSystem {
    public static void main(String[] args) {
        // Creating objects
        Printable report1 = new Report("Annual Report", "Alice");
        Printable report2 = new Report("Financial Summary", "Bob");

        Printable invoice1 = new Invoice("INV1001", 1500.50);
        Printable invoice2 = new Invoice("INV1002", 3200.75);

        // Storing in Printable array
        Printable[] items = { report1, report2, invoice1, invoice2 };

        // Loop to print details
        System.out.println("=== Printing All Documents ===");
        for (Printable item : items) {
            item.printDetails();
        }
    }
}