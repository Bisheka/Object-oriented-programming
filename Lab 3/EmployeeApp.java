import java.util.Scanner;

    public class EmployeeApp {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);


            System.out.print("Enter Employee ID: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = input.nextLine();

            System.out.print("Enter Basic Salary: ");
            double basicSalary = input.nextDouble();

            System.out.print("Enter Performance Rating (1-5): ");
            int rating = input.nextInt();

            // Create Employee object
            Employee employee = new Employee(id, name, basicSalary, rating);

            System.out.println();
            employee.displayEmployeeDetails();
        }
    }


