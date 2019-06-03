public class JavaExercises1_3 {

    public static void main(String[] args){
        threeEqualInts(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
        RobustQuadratic(Double.parseDouble(args[3]),Double.parseDouble(args[4]),Double.parseDouble(args[5]));
        isBetween01(Double.parseDouble(args[6]),Double.parseDouble(args[7]));
        AdjustedWindChill(Double.parseDouble(args[8]),Double.parseDouble(args[9]));
        ThousandInts();
        NRandomInts(Integer.parseInt(args[10]));
        FunctionGrowth();
    }


    // Exercise 1.3.1 - This program takes 3 integers from the command line and prints equal if they are equal and not equal else
    public static void threeEqualInts(int int1, int int2, int int3){
        if (int1 == int2 && int1 == int3 && int2 == int3) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }


    // Exercise 1.3.2 - This program is a more robust version of the Quadratic Program (1.2.3) that checks if a < 0 and if the discriminant is negative
    public static void RobustQuadratic(double a, double b, double c){
        double discriminant = b*b - 4.0*a*c;
        double d = Math.sqrt(discriminant);
        // Degenerate Cases
        if (a == 0.0){
            System.out.println("A is zero, cannot solve for roots.");
        } else if (discriminant < 0){
            System.out.println("Discriminant is negative, no real roots.");
        } else {
            System.out.println((-b + d) / (2.0*a));
            System.out.println((-b - d) / (2.0*a));
        }
    }

    // Exercise 1.3.4 - This program checks if two doubles are strictly between 0 and 1 and prints true if they are
    public static void isBetween01(double x, double y) {
        if (x < 1 && x > 0 && y < 1 && y > 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Exercise 1.3.5 - This is an adjusted version of WindChill that checks if the doubles v and t fall within the acceptable range of values
    public static void AdjustedWindChill(double v, double t){
        if (Math.abs(t) > 50 || v > 120 || v < 3){
            System.out.println("The formula is not valid for these values.");
        } else {
            double windChill = 35.74+0.6215* t+(0.4275*t-35.75)*Math.pow(v,0.16);
            System.out.println("The windchill is " + windChill);
        }
    }

    // Exercise 1.3.8 - Prints all numbers between 1000 and 2000 with five ints per line
    public static void ThousandInts() {
        for (int i = 1000; i <= 2000; i++){
            System.out.print(i + " ");
            if (i%5 == 0){
                System.out.println();
            }
        }
    }

    //Exercise 1.3.9 - This program takes an int N from the command line and prints N random values between 0 and 1 and prints their average value
    public static void NRandomInts(int N){
        double sum = 0;
        for (int i = 0; i < N; i++){
            double randNum = Math.random();
            System.out.println(randNum);
            sum = sum + randNum;
        }
        double average = sum/N;
        System.out.println("The average of these values is " + average);
    }

    //Exercise 1.3.11 - This program prints a table of the values logN, N, NlogN, N^2, N^3, and 2^N
    public static void FunctionGrowth() {
        for (int N = 16; N <=2048;N = N*2){
            System.out.println(Math.log(N) + "\t" + N + "\t" + N * Math.log(N) + "\t" + Math.pow(N,2) + "\t" + Math.pow(N,3) + "\t" + Math.pow(2,N));
        }
    }


}
