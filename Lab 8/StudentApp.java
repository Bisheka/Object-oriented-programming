public class StudentApp {
    public static void main(String[] args) {
        Courses c1 =new Courses("java programming","Java");
        Courses c2 =new Courses("python programming","Python");
        Courses c3 =new Courses("C++ programming","C++");

        Student s1 =new Student();

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.enrollCourse(c3);

        s1.displayDetails();
    }
}

