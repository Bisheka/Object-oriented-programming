package LAB_9_3;

public class UniversitySystem {
    public static void main(String[] args) {
        // Set static university name
        Student.universityName = "ABC University";

        // Create student objects
        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");

        System.out.println("=== Student Info (Initial University) ===");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();

        // Change university name
        Student.universityName = "XYZ University";

        System.out.println("=== Student Info (After University Change) ===");
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}
