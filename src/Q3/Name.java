package Q3;

public class Name {
    private String firstName;
    private String lastName;

    public Name(){} //constructor
    public Name (String fN, String lN){ //assigns user inputted variables to the variables of the class
        firstName = fN;
        lastName =lN;


    }
    public String toString (){
        return String.format("\nName: %s %s", firstName,lastName);
    }

}
