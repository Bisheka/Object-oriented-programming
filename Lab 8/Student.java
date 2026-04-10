public class Student {
    private String studentId;
    private String studentName;
    private Courses[] courses=new Courses[3];
    private int courseCount=0;

    public Student(){
        this.studentId="";
        this.studentName="";
    }
    public void enrollCourse(Courses c){
        if(courseCount<3){
            courses[courseCount]=c;
            courseCount++;
        }else{
            System.out.println("Can not enroll more than 3 courses");
        }
    }
    public void displayDetails(){
        System.out.println("Student ID"+studentId);
        System.out.println("Student Name"+studentName);
        System.out.println("Enroll courses");
        for(int i=0;i<courseCount;i++){
            courses[i].displayDetails();
            System.out.println();
        }
}

}
