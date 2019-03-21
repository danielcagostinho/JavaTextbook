package Creative_Exercises_1_2;

public class OrderCheck {

    public static void main(String[] args){
        // Exercise 1.2.28 - This program takes 3 doubles from the command line and returns true if they are strictly increasing or decreasing
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);
        System.out.println((x<y && y<z)|| (x>y && y>z));
    }
}
