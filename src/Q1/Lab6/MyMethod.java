package Q1.Lab6;

import java.util.Scanner;

public class MyMethod {
    public static void main(String[]args){
        int power=0,n=0;
        double base=0,degS,degC;
        char choice;
        //variable declarations
        Scanner input = new Scanner(System.in);
        //initializes scanner
        myHeader("Jonathan Seo",6,1);
        //calls on my header method
        System.out.println("Testing Mathematical Functions: ");
        //formatting
        while (true) {
            //infinite loop until break statement gets involved
            System.out.println("\n=====================");
            System.out.println("a: Power Function");
            System.out.println("b: Factorial Function");
            System.out.println("c: Sine Function");
            System.out.println("d: Cosine Function");
            System.out.println("e: exit");
            System.out.println("=====================\n");
            //line 25-31 formatting and prompts
            System.out.print("Enter your choice: ");
            //prompt
            choice = input.next().charAt(0);
            //takes first character
            System.out.print("\n");
            //formatting
            switch(choice){
                //switch command to create a case for each choice and a default if one is not chosen
                case 'a':
                    // if 'a' is inputted
                    System.out.println("POWER FUNCTION: Calculating x to the power of y.");
                    //formatting
                    System.out.print("Enter x: ");
                    //prompt
                    base = input.nextDouble();
                    //takes input of double
                    System.out.print("Enter y: ");
                    //prompt
                    power = input.nextInt();
                    //takes input of int
                    System.out.printf("%.2f^%d = %.2f\n",base,power,myPow(base,power));
                    //outputs message with numbers to 2DP and calls on myPow method
                    break;
                //breaks out of switch statements

                case 'b':
                    // if 'b' is inputted
                    System.out.println("FACTORIAL FUNCTION: Calculating factorial of n.");
                    //formatting
                    System.out.print("Enter n: ");
                    //prompt
                    n = input.nextInt();
                    //takes input of int
                    System.out.printf("%d! = %.2f\n",n,myFactorial(n));
                    //outputs message with number rounded to 2DP and calls on myFactorial method
                    break;
                //breaks out of switch statements

                case 'c':
                    // if 'c' is inputted
                    System.out.println("SINE FUNCTION: Calculating sin(k) degree.");
                    //formatting
                    System.out.print("Enter k in degrees: ");
                    //prompt
                    degS=input.nextDouble();
                    //takes input of double
                    System.out.printf("sin(%.2f) degree = %.2f\n",degS,mySin(myDegreeToRadian(degS)));
                    //outputs message where numbers are to 2 DP and calls on mySin and myDegreeToRadian
                    break;
                //breaks out of switch statements

                case 'd':
                    // if 'd' is inputted
                    System.out.println("COSINE FUNCTION: Calculating cos(m) degree.");
                    //formatting
                    System.out.print("Enter m in degrees: ");
                    //prompt
                    degC=input.nextDouble();
                    //takes input of double
                    System.out.printf("cos(%.2f) degree = %.2f\n",degC,myCos(myDegreeToRadian(degC)));
                    //outputs message where numbers are to 2 DP and calls on myCos and myDegreeToRadian
                    break;
                //breaks out of switch statements

                case 'e':
                    // if 'e' is inputted
                    break;
                //breaks out of switch statements

                default:
                    //if no valid is picked this will be used
                    System.out.println("Invalid choice!");
                    //prints message

            }
            if (choice=='e'){
                //only if e is chosen we will exit the loop and finish the programs run
                break;
                //breaks out of while loop
            }


        }
        myFooter("Goodbye from Jonathan Seo!");
        //calls on myFooter method
    }
    public static double myPow(double x, int y) {
        double r=1;
        int i =1;
        //initialization
        if (y<1) {
            y=-y;
            //gets abs of y
            while (i <= y) {
                //if exponent is greater than or = to 1
                r = r / x;
                //last result divided by base
                i++;
                //increases exponent by 1 for next run
                // Covers power functions where the exponent is a neg number
            }
        }
        else {
            while (i <= y) {
                //if exponent is less than 0
                r = r * x;
                //last result times by base
                i++;
                //increases exponent by 1 for next run
                //covers power functions where the exponent is a positive number
            }
        }
        return r; // returns r from the result of the if/else statements or if it doesn't fit it is simply = 1
    }
    public static double myFactorial(int n){
        double r=1;
        int i=1;
        //variable initialization and declarations
        //variable to hold original value
        while (i<=n){
            //while index is less than or equal to n
            r*=i;
            //r is now r multiplied by current index
            i++;
            //index + 1
        }
        return r;
        //returns a value to where the call is
    }
    public static double mySin(double x){
        int N=20, n;
        double y=0;
        //variable initialization and declarations

        for (n=0;n<=2*N+1;n++){
            //initializes n=0, continues while n is less than N and each round n increases by 1
            double p1,p2,p3;
            //variable declarations
            p1=myPow(-1,n);
            //takes part above rational so simply -1 to the exponent n (even num = +1 odd = -1)
            p2=myFactorial(2*n+1);
            //completes factorial of 2*n+1 which is under the rational
            p3=myPow(x,(2*n+1));
            //completes x to the 2n+1 which is multiplied by the result of the rational
            //This statement avoids a bug where the value would be naN (not a Number) because p2 is so close to 0 it thinks it is 0.
            y=y+(p1/p2)*p3;
            //completes operation of 3 parts

        }
        return y;
        //returns final value to original call location
    }
    public static double myCos(double x){
        int N=20, n;
        double y=0;
        //variable initialization and declarations

        for (n=0;n<=2*N;n++){
            //initializes n=0, continues while n is less than N and each round n increases by 1
            double p1,p2,p3;
            p1=myPow(-1,n);
            //takes part above rational so simply -1 to the exponent n (even num = +1 odd = -1)
            p2=myFactorial(2*n);
            //completes factorial of 2*n which is under the rational
            p3=myPow(x,(2*n));
            //completes x to the 2n which is multiplied by the result of the rational
            y=y+(p1/p2)*p3;
            //completes operation of 3 parts
        }
        return y;
        //returns final value to original call location
    }

    public static double myDegreeToRadian(double degree){
        double rad;
        //variable  declarations
        rad=degree*(Math.PI/180);
        //turns degrees into radians
        return rad;
        //returns radians
    }
    public static void myHeader(String fullName, int labNum, int quesNum){
        System.out.println("**********************************************************");
        //prints line of stars
        System.out.println(fullName);
        //prints full name
        System.out.println("Lab "+labNum+", Question "+quesNum);
        //prints lab # and question #
        System.out.println("**********************************************************");
        //prints line of stars and leaves an extra line

    }
    public static void myFooter(String message){
        System.out.print("*** "+message+" ***");
        //prints 3 stars on either side of message to sign off
    }
}

