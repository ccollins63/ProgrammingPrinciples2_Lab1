//Cameron Collins
//August 23
package Lab1;

import java.util.Random;

public class DiceRoll36 {

    public static void main (String args[]){

        Random dice         = new Random(); //creates an object of class Random
        double[] totalTable = new double [12]; //creates an array to contain the sum of dice rolls

        //creates two dice
        int die1;
        int die2;

        //loop to simulate 36000 rolls
        for(int rolls = 0; rolls < 36000; rolls++){
            die1 = (dice.nextInt(6) + 1);
            die2 = (dice.nextInt(6) + 1);

            int total;

            //determines the sum of the two dice and adds to the count
            if(die1 + die2 == 2) {
                total = 2;
            }
            else if(die1 + die2 == 3){
                total = 3;
            }
            else if(die1 + die2 == 4){
                total = 4;
            }
            else if(die1 + die2 == 5){
                total = 5;
            }
            else if(die1 + die2 == 6){
                total = 6;
            }
            else if(die1 + die2 == 7){
                total = 7;
            }
            else if(die1 + die2 == 8){
                total = 8;
            }
            else if(die1 + die2 == 9){
                total = 9;
            }
            else if(die1 + die2 == 10){
                total = 10;
            }
            else if(die1 + die2 == 11){
                total = 11;
            }
            else{
                total = 12;
            }

            totalTable[total - 1] += 1.0;
        }

        //displays table heading
        System.out.println("\tSum\t\t  Frequency\t\t  Percentage");
        System.out.println("----------------------------------------------------------------------");

        for(int table = 1; table < totalTable.length; table++) {

            //equation to find the percentage of occurrence
            Double equation   = ((totalTable[table] / 36000.0) * 100.0);
            String percentage = String.format("%.2f", equation) + "";

            //displays data table
            System.out.print("\t "   + (table + 1)       + "\t");
            System.out.print("\t   " + totalTable[table] + "\t");
            System.out.print("\t\t"  + percentage        + "\t");
            System.out.println("");
        }
    }
}
