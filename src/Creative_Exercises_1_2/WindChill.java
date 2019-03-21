package Creative_Exercises_1_2;

public class WindChill {
    public static void main(String[] args){
        // Exercise 1.2.25 - Calculate windchill based on windspeed v and temperature in fahrenheit t
        double v = Double.parseDouble(args[0]);
        double t = Double.parseDouble(args[1]);
        System.out.println("The wind chill for a " + t + " degree day when the wind is blowing at " + v + " mph is " + getWindChill(v,t));
    }

    public static double getWindChill(double v, double t){
        // This formula is taken from the textbook
       return 35.74+0.6215* t+(0.4275*t-35.75)*Math.pow(v,0.16);
    }
}
