package Q3;

public class CourseAndInstructor extends InstructorInfo{
    private String courseName; //declares variable
    public CourseAndInstructor(){
    }
    //this constructor gets all the right info from the driver class when called
    public CourseAndInstructor(String cN,String fN, String iN, String oL){
        super (fN,iN,oL); // sends some info to instructor info
        courseName = cN; //assigns the course name to the variable

    }
    public String toString(){ //prints the string
        return String.format(super.toString()+"\nCourse Name: "+courseName);
    }
}
