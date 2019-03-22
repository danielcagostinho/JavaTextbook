package Creative_Exercises_1_2;

public class ThreeSort {

    public static void main(String[] args){
        // Exercise 1.2.34 - Takes in 3 numbers and sorts them from lowest to highest
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double min = Math.min(x,Math.min(y,z));
        double max = Math.max(x,Math.max(y,z));
        double mid = (x + y + z)-(max + min);

        System.out.println("In order the numbers are: " + min + ", " + mid + ", " + max + ".");
    }

}
