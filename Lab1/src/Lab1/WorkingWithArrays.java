//Cameron Collins
//August 23
package Lab1;

public class WorkingWithArrays {
    public static void main (String args[]) {

        //creates array containing data values
        double[] array = {2683, 2654, 3090, 3325, 4881, 3300, 7456, 3780, 3232, 7270,
                7773, 5553, 2850, 7619, 2762, 6965, 4539, 3131, 6066, 5404,
                4183, 6830, 2424, 4517, 6599, 3714, 7351, 4243, 6688, 7819,
                6449, 3781, 5565, 3283, 7427};

        //prints out the different information on the data in the array
        System.out.println("Max Value:  " + (int)MaxValue(array));
        System.out.println("Min Value:  " + (int)MinValue(array));
        System.out.println("Total:      " + (int)Total(array));
        System.out.println("Average:    " + Math.round(Average(array) * 100.0) / 100.0);
    }

    //method that finds the max value in the array
    private static double MaxValue(double[] array){
        double maxValue = 0;

          for (int i = 0; i < array.length; i++)
              if (maxValue < array[i])
                  maxValue = array[i];
          
          return maxValue;
    }

    //method that finds the minimum value in the array
    private static double MinValue(double[] array) {
        double minValue = array[0];

        for (int i = 0; i < array.length; i++)
            if (minValue > array[i])
                minValue = array[i];

        return minValue;
    }

    //method that finds the total of all of the data in the array
    private static double Total(double[] array) {
        double total = 0;

        for (int i = 0; i < array.length; i++)
            total = total + array[i];

        return total;
    }

    //method that finds the average of all of the data in the array
    private static double Average(double[] array){
        double total   = 0;
        double average;

        for (int i = 0; i < array.length; i++)
            total = total + array[i];

        average = (total / array.length);

        return average;
      }
}
