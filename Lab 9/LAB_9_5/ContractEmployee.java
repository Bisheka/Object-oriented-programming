package LAB_9_5;

class ContractEmployee extends Employee implements Payable {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(int empId, String name, double hourlyRate, int hoursWorked) {
        super(empId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void generatePayslip() {
        System.out.println("=== Payslip for Contract Employee ===");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("--------------------------------------");
    }
}
