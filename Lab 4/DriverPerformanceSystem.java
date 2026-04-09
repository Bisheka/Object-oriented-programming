public class DriverPerformanceSystem {
    public static void main(String[] args) {
        Driver driver1 = new Driver("01001", "John Smith", 4000.0, 5);
        Driver driver2 = new Driver("01002", "Emily Davis", 3500.0, 3);
        Driver driver3 = new Driver("01003", "Michael Johnson", 5000.0, 1);

        driver1.displayDetails();
        driver2.displayDetails();
        driver3.displayDetails();

        System.out.println("\nBonus for " + driver3.getDriverID() + " with custom rating 4: " + driver3.calculateBonus(4));
    }
}
