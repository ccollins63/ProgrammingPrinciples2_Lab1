//Cameron Collins
//August 23
package Lab1;

public class QuadraticEquation {

    //data fields
    private double A = 0;
    private double B = 0;
    private double C = 0;

    //no arg constructor
    public QuadraticEquation() {
    }

    //constructor
    public QuadraticEquation(double a, double b, double c) {
        A = a;
        B = b;
        C = c;
    }

    public double getA() {
        return A;
    } //accessor method for coefficient values

    public double getB() {
        return B;
    } //accessor method for coefficient values

    public double getC() {
        return C;
    } //accessor method for coefficient values

    public double getDiscriminant() {
        double discriminant = (Math.pow(B, 2) - (4 * A * C));
        return discriminant;
    }

    //accessor method for root
    public double getRoot0(double discriminant) {
        double Root0 = ((-B + Math.sqrt(discriminant)) / (2 * A));
        return Root0;
    }

    //accessor method for root
    public double getRoot1(double discriminant) {
        double Root1 = ((-B - Math.sqrt(discriminant)) / (2 * A));
        return Root1;
    }
}
