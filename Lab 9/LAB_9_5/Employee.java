package LAB_9_5;

abstract class Employee {
    protected int empId;
    protected String name;

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    // Abstract method
    public abstract double calculateSalary();
}

// Interface Payable
interface Payable {
    void generatePayslip();
}

// PermanentEmployee class
class PermanentEmployee extends Employee implements Payable {
    private double monthlySalary;

    public PermanentEmployee(int empId, String name, double monthlySalary) {
        super(empId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void generatePayslip() {
        System.out.println("=== Payslip for Permanent Employee ===");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("--------------------------------------");
    }
}
