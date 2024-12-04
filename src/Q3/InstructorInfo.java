package Q3;

public class InstructorInfo extends Name{
    private String officeLocation; // office number variable
    public InstructorInfo(){ //constructor

    }
    public InstructorInfo(String fN, String lN,String oL){ //gets the info from driver which user assigned
        super (fN,lN); //sends some info to the name class to be printed
        officeLocation = oL; // assigns the office number variable
    }
    public String toString(){ //prints the string

        return String.format("\nInstructor's Info:"+super.toString() +"\nOffice Location: "+ officeLocation);
    }
}
