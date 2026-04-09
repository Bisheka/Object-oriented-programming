import java.util.Scanner;
public class Driver {
    private String driverID;
    private String driverName;
    private double baseSalary;
    private int performanceScore;

    // Constructor 1: Accepts only driverID and driverName
    public Driver(String driverID, String driverName) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = 0.0;
        this.performanceScore = 1; // Default performance score
    }

    // Constructor 2: Accepts only baseSalary
    public Driver(double baseSalary) {
        this.driverID = "Unknown";
        this.driverName = "Unknown";
        this.baseSalary = baseSalary;
        this.performanceScore = 1; // Default performance score
    }

    // Constructor 3: Accepts all four attributes
    public Driver(String driverID, String driverName, double baseSalary, int performanceScore) {
        this.driverID = driverID;
        this.driverName = driverName;
        this.baseSalary = baseSalary;
        setPerformanceScore(performanceScore);
    }

    public String getDriverID() {
        return driverID;
    }

    public void setDriverID(String driverID) {
        this.driverID = driverID;
    }

    public int getPerformanceScore() {
        return performanceScore;
    }

    public void setPerformanceScore(int performanceScore) {
        if (performanceScore < 1 || performanceScore > 5) {
            this.performanceScore = 1; // Default to 1 if invalid
        } else {
            this.performanceScore = performanceScore;
        }
    }

    public double calculateBonus() {
        return calculateBonus(this.performanceScore);
    }

    public double calculateBonus(int customScore) {
        double bonusPercentage = 0;
        switch (customScore) {
            case 5: bonusPercentage = 0.25; break;
            case 4: bonusPercentage = 0.20; break;
            case 3: bonusPercentage = 0.15; break;
            case 2: bonusPercentage = 0.10; break;
            case 1: bonusPercentage = 0.00; break;
        }
        return baseSalary * bonusPercentage;
    }

    public double calculateTotalSalary() {
        return baseSalary + calculateBonus();
    }

    public void displayDetails() {
        System.out.println("\nDriver ID: " + driverID);
        System.out.println("Name: " + driverName);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Performance Score: " + performanceScore);
        System.out.println("Bonus: " + calculateBonus());
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}
