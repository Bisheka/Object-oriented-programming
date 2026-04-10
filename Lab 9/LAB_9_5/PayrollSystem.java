package LAB_9_5;

public class PayrollSystem {
    public static void main(String[] args) {
        // Creating permanent and contract employees
        Payable emp1 = new PermanentEmployee(101, "Alice", 50000.00);
        Payable emp2 = new ContractEmployee(202, "Bob", 500.00, 40);

        // Generate payslips
        emp1.generatePayslip();
        emp2.generatePayslip();
    }
}
