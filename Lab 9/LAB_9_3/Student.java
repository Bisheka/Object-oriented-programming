package LAB_9_3;

public class Student {
        private int studentId;
        private String studentName;
        static String universityName; // Shared by all students

        // Constructor
        public Student(int studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
        }

        // Method to display student info
        public void displayStudentInfo() {
            System.out.println("Student ID: " + studentId);
            System.out.println("Student Name: " + studentName);
            System.out.println("University: " + universityName);
            System.out.println("---------------------------");
        }
    }
