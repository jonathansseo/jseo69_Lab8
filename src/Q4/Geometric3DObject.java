package Q4;

public abstract class Geometric3DObject {

        private double r; // create 3 new variables r,h,PI
        private double h;
        public double PI = Math.PI; // assign var PI the value of pi

        protected Geometric3DObject(){
        }

        protected Geometric3DObject(double rad, double het){
            r=rad; //assign the value of r and h to rad, and het
            h=het;
        }

        // Uses getter method returns the radius
        public double getR(){
            return r;
        }

        //return the high when called
        public double getH() {
            return h;
        }

        //overrides the getArea method
        public abstract double getArea();
        public String toString(){
            return String.format("Given Values: Radius = %.2f cm and Height = %.2f cm\n",r,h);
        }
    }

