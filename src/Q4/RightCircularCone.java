package Q4;

import Q1.Lab6.MyMethod;

//  Create a child class tht extends Geometric3DObject and implements the interface established
public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface{

//    Default no argument constructor
    public RightCircularCone(){
    }

//    Constructor uses super to access fields declared in the parent class
    public RightCircularCone(double r, double h){
        super(r,h);
    }

//    Get area method returns the surface area of a cone
    public double getArea(){
        double result = PI*getR()*(getR()+ (Math.sqrt(MyMethod.myPow(getH(),2)+MyMethod.myPow(getR(),2))));
        return result;
    }

//    Get volume method returns the volume of the cone when called
    public double getVolume(){
        double result = (PI*MyMethod.myPow(getR(),2)*getH())/3.0;
        return result;
    }

//    Overridden toString method will print the new results when called
    public String toString(){
        return (super.toString()+ String.format("Cone's Surface Area= %.2f square cm" +
                "\nCone's Volume = %.2f cubic cm\n",getArea(),getVolume()));
    }

}
