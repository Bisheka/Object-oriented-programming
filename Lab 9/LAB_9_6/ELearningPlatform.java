package LAB_9_6;

public class ELearningPlatform {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Alice");
        student.enrollCourse("Java Programming");

        // Create an instructor
        Instructor instructor = new Instructor("Dr. Smith");
        instructor.enrollCourse("Data Structures");
        instructor.assignCourse("Data Structures");
    }
}