package Q3;

public class StudentInfo extends Name{
    private int studentNumber;
    private CourseAndInstructor courseInfo;
    public StudentInfo(){
    } //constructor for student info
    public StudentInfo(String fN, String lN,int sN,CourseAndInstructor cInfo){ //gets all the driver info and then puts in terms of variables for the class
        super (fN,lN); //sends first and last name to name class
        studentNumber = sN; //assigns all the other variables to match the private class varaibles
        courseInfo = new CourseAndInstructor();
        courseInfo = cInfo;

    }
    public String toString(){ //prints to string
        return String.format(super.toString()+"\nStudent Number: "+studentNumber+courseInfo.toString());
    }

}
