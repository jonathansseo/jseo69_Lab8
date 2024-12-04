package Q4;

import Q1.Lab6.MyMethod;

//  Create a child class tht extends Geometric3DObject and implements the interface established
public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface{

//    Default no argument constructor
    public RightCylinder(){
    }

//    Constructor utilizes super to access parents fields
    public RightCylinder(double r, double h){
        super(r,h);
    }

//    Get area method returns the surface area of a cylinder when called
    public double getArea(){
        double result = 2.0*PI*getR()*(getR()+getH());
        return result;
    }

//    Get volume method will return the value of the cylinder's volume when called
    public double getVolume(){
        double result = PI* MyMethod.myPow(getR(),2)*getH();
        return result;
    }

//    Overridden toString will print the required information when called
    public String toString(){
        return (super.toString() + String.format("Cylinder's Surface Area= %.2f square cm" + "\nCylinder's Volume= %.2f cubic cm",getArea(),getVolume()));
    }
}

