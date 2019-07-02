//Cameron Collins
//August 23
package Lab1;

public class TestQuadraticEquation {
    public static void main (String args[]){
        //creates two object classes
        QuadraticEquation equation1 = new QuadraticEquation(1, -3, -4);
        QuadraticEquation equation2 = new QuadraticEquation(1, 0, -4);

        //gets the value of the discriminant for both equations
        double discriminantValue1 = equation1.getDiscriminant();
        double discriminantValue2 = equation2.getDiscriminant();

        //Print out the roots of each equation
        System.out.println("The roots of equation 1 are " + equation1.getRoot0(discriminantValue1) + " and " + equation1.getRoot1(discriminantValue1) + ".");
        System.out.println("The roots of equation 2 are " + equation2.getRoot0(discriminantValue2) + " and " + equation2.getRoot1(discriminantValue2) + ".");

    }
}
