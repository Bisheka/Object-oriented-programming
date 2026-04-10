package LAB_9_6;

class Instructor implements Enrollable, Teachable {
    private String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public void enrollCourse(String courseName) {
        System.out.println("Instructor " + instructorName + " enrolled in course: " + courseName);
    }

    @Override
    public void assignCourse(String courseName) {
        System.out.println("Instructor " + instructorName + " assigned to teach course: " + courseName);
    }
}
