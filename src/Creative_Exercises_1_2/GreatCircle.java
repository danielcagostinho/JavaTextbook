package Creative_Exercises_1_2;

public class GreatCircle {

    public static void main(String[] args) {
        // Exercise 1.2.33 - Take four arguments of x1 x2 y1 y2 and prints the great circle distance between those two points
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double x2 = Math.toRadians(Double.parseDouble(args[1]));
        double y1 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double d = 60 * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.println("The great-circle distance is " + d);

    }

}
