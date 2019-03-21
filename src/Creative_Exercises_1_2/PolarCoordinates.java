package Creative_Exercises_1_2;

public class PolarCoordinates {
    public static void main(String[] args){
        // Exercise 1.2.26 - Calculate polar coordinates based on x and y values passed in through command line arguments
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double r = getPolar(x,y)[0];
        double theta = getPolar(x,y)[1];
        System.out.println("The polar coordinate form for the x,y pair (" + x + "," + y + ") is {" + r + "," + theta + ").");
    }

    public static double[] getPolar(double x, double y){
        return new double[] {Math.sqrt(x*x + y*y), Math.atan2(y,x)};
    }
}
