package Creative_Exercises_1_2;

public class Mercator {

    public static void main(String[] args){
        // Exercise 1.2.31 - Prints the Mercator projection.
        double lambda0 = Double.parseDouble(args[0]);
        double phi = Double.parseDouble(args[1]);
        double lambda = Double.parseDouble(args[2]);
        double x = lambda - lambda0;
        double y = 0.5 * Math.log((1+Math.sin(phi))/(1-Math.sin(phi)));
        System.out.println("The Mercator projection of " + phi + " and " + lambda + " is (" + x + "," + y + ").");

    }

}
