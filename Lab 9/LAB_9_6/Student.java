package LAB_9_6;

class Student implements Enrollable {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println("Student " + studentName + " enrolled in course: " + courseName);
    }
}
