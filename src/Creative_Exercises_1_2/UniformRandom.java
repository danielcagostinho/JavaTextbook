package Creative_Exercises_1_2;

public class UniformRandom {

    public static void main(String[] args){
        // Exercise 1.2.30 - PRints five uniform random values between 0 and 1, their average value and their max and min
        double a = Math.random();
        double b = Math.random();
        double c = Math.random();
        double d = Math.random();
        double e = Math.random();
        double avg = (a+b+c+d+e)/5;
        double minNum = Math.min(a,Math.min(b,Math.min(c,Math.min(d,e))));
        double maxNum = Math.max(a,Math.max(b,Math.max(c, Math.max(d, e))));
        System.out.println("The five random numbers are: " + a + ", " + b + ", " + c + ", " + d + ", " + e + ".");
        System.out.println("The average is: " + avg);
        System.out.println("The maximum is: " + maxNum + ", and the minimum is " + minNum + ".");
    }

}
