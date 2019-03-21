public class JavaExercises1_2 {
    public static void main(String[] args){
        // Arguments: theta, evenDivide(1), evenDivide(2), triSide(1), triSide(2), triSide(3), randInt(1), randInt(2)
        double theta = Double.parseDouble(args[0]);
        trigIdentity(theta);
        addConcatOutput();
        charOutput();
        maxValOutput();
        piOutput();
        System.out.println(isEvenDivide(Integer.parseInt(args[1]),Integer.parseInt(args[2])));
        System.out.println(isTriangle(Integer.parseInt(args[3]),Integer.parseInt(args[4]),Integer.parseInt(args[5])));
        System.out.println(randomInt(Integer.parseInt(args[6]),Integer.parseInt(args[7])));
        sumDice();
        System.out.println(sineOutput(Double.parseDouble(args[8])));
        System.out.println(displacement(Double.parseDouble(args[9]),Double.parseDouble(args[10]), Double.parseDouble(args[11])));
        System.out.println(isBtwnDates(Integer.parseInt(args[12]),Integer.parseInt(args[13])));
    }

    public static void trigIdentity(double theta){
        // Exercise 1.2.2 - Determines if a theta passed in as a command line argument follows the trig identity 1 = sin^2(theta) + cos^2(theta)
        System.out.println(1 == (int)(Math.sin(theta)*Math.sin(theta) + Math.cos(theta)*Math.cos(theta)));
    }

    public static void addConcatOutput(){
        // Exercise 1.2.7 - Experiments with outputting different strings
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2+3) + "bc");
        System.out.println("bc" + (2+3));
        System.out.println("bc" + 2 + 3);
        System.out.println("The output above results from the difference between concatenating a int literal vs adding in the string. \nWhen the numbers are in the parentheses, the compiler interprets it as addition which is then concatenated.\nIn the second case, the first two integers are not  separated by a string in between so the compiler adds the \ntwo numbers");
    }

    public static void charOutput(){
        // Exercise 1.2.9 - Experiments with outputting different strings
        System.out.println('b');
        System.out.println((char)('b' + 'c' - 'c'));
        System.out.println((char) ('a' + 4));
        System.out.println("The output above where b + c = 197 results from the addition of two chars. The resulting value from b + c is \n197 which is the combined value of the codes for b and c. The output for (char) ('a'+4) is the int representing \na, added to 4, and converted back into the char e.");
    }

    public static void maxValOutput(){
        // Exercise 1.2.10 - Experiments with outputting different numbers close to the max value
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(2-a);
        System.out.println(-2-a);
        System.out.println(2*a);
        System.out.println(4*a);
        System.out.println("The discrepancies of the expected values are due to the limitations of the precision of the computer. a is \nthe max value that can be stored, so any case that would result in a larger number would be incorrectly \nrepresented. For example for 2 * a, the result is negative two because the number is stored in two's \ncomplement, when multiplied by two, it overflows to the binary representation of -2.");
    }

    public static void piOutput(){
        // Exercise 1.2.11 - Experiments with outputting different numbers close to pi
        double a = 3.141519;
        System.out.println(a);
        System.out.println(a+1);
        System.out.println(8/(int) a);
        System.out.println(8/a);
        System.out.println((int) (8/a));
        System.out.println("The first output is what is expected. \nThe second output has small error due to adding floating point numbers. 8 / 3 is 2 as expected. \nWhen 8 is divided by a, it is an operation of an int divided by a double. The compiler casts the \nnumerator as a double to compensate and the resulting number is the quotient of 8/3.141519. \nThe final output is just the integer-type cast of the double from the previous output.");
    }

    public static boolean isEvenDivide(int num1, int num2){
        // Exercise 1.2.14 - Checks to see if two positive integers evenly divide each other.
        return (num1 % num2 == 0);
    }

    public static boolean isTriangle(int num1, int num2, int num3){
        // Exercise 1.2.15 - Checks to see if the three numbers could be lengths to the sides of a triangle.
        return ((num1 >= num2 + num3) || (num2 >= num1 + num3) || (num3 >= num1 + num2));
    }

    public static int randomInt(int a, int b){
        // Exercise 1.2.19 - Prints a random integer between a and b
        double randNum = Math.random(); // Random number between 0 and 1
        randNum = (int)(randNum * ((b - a) + 1)) + a; // Multiplies it by the end of interval and rounds up.
        return (int) randNum;
    }

    public static void sumDice(){
        // Exercuse 1.2.20 - Prints the sum of two random numbers between 1 and 6
        int randNum1 = randomInt(1,6);
        int randNum2 = randomInt(1,6);
        System.out.println(randNum1 + randNum2);
    }

    public static double sineOutput(double t){
        // Exercise 1.2.21 - Takes in a double, t, from the command line arguments and outputs sin(2t) + sin(3t)
        return Math.sin(2*t) + Math.sin(3*t);
    }

    public static double displacement(double x, double v, double t){
        // Exercise 1.2.22 - Outputs the displacement of an object thrown straight up
        double g = 9.78033;
        return x + v*t + g*(t*t)/2;
    }

    public static boolean isBtwnDates(int m, int d){
        // Exercise 1.2.23 - Checks if a date is between 3/20 and 6/20
        return (m == 3 && d >= 20) || (m > 3 && m < 6) || (m == 6 && d <=20);
    }

}
