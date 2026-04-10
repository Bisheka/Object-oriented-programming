public class Courses {

        private String courseCode;
        private String courseTitle;

        public Courses(String courseCode,String courseTitle){
            this.courseCode=courseCode;
            this.courseTitle=courseTitle;
        }
        public void displayDetails(){
            System.out.println("Cours Code"+courseCode);
            System.out.println("Course Title"+courseTitle);
}
    }

