public class Employee {
    private int employeeId;
    private String name;
    private double basicSalary;
    private int performanceRating;

    // overload Constructor
    public Employee(int employeeId, String name, double basicSalary, int performanceRating) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.performanceRating = performanceRating;
    }

    // Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    public void setPerformanceRating(int performanceRating) {
        if (performanceRating >= 1 && performanceRating <= 5) {
            this.performanceRating = performanceRating;
        } else {
            System.out.println("Invalid Performance Rating");
            this.performanceRating = 1;
        }
    }

    public double calculateBonus() {
        double bonusPercentage = 0.0;

        switch (performanceRating) {
            case 5: bonusPercentage = 0.20; break;
            case 4: bonusPercentage = 0.15; break;
            case 3: bonusPercentage = 0.10; break;
            case 2: bonusPercentage = 0.05; break;
            case 1: bonusPercentage = 0.0; break;
        }

        return basicSalary * bonusPercentage;
    }

    public double calculateTotalSalary() {
        return basicSalary + calculateBonus();
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Employee Salary:" + basicSalary);
        System.out.println("Performance Rating(1-5): " + performanceRating);
        System.out.println("Bonus Amount: Rs. " + calculateBonus());
        System.out.println("Total Salary: Rs. " + calculateTotalSalary());
    }
}


