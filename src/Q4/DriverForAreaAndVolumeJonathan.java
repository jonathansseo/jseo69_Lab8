package Q4;
import Q1.Lab6.MyMethod;

public class DriverForAreaAndVolumeJonathan {
    public static void printResult(Geometric3DObject anyName){
        System.out.println(anyName.toString());
    }
    public static void main(String[] args) {


        MyMethod.myHeader("Jonathan Seo",8,4); //Header is called and printed

        // r and h are assigned random values
        double r = Math.random() + 2;

        double h = Math.random()* 3 + 4;


        Geometric3DObject cone = new RightCircularCone(r,h); //3D object is created with the random variables r and h

        Geometric3DObject cylinder = new RightCylinder(r,h); // Another 3D object is created with the random variables r and h

        printResult(cone); //outputs the cone
        printResult(cylinder); //outputs the cylinder


        MyMethod.myFooter("Goodbye from Jonathan Seo!"); // calls and prints the footer
    }
}
