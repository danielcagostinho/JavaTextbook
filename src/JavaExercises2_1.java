public class JavaExercises2_1 {

    public static int max3(int a, int b, int c){
        // Exercise 2.1.1 - This method takes in 3 integers and returns the value of the largest one.
        int max = Math.max(a,b);
        return Math.max(max,c);
    }
    public static double max3(double a, double b, double c){
        // Exercise 2.1.1 - This method takes in 3 doubles and returns the value of the largest one.
        double max = Math.max(a,b);
        return Math.max(max,c);
    }

    public static boolean odd(boolean a, boolean b, boolean c){
        // Exercise 2.1.2 - This method takes three boolean inputs and returns true if an odd number of inputs are true and false otherwise.
        int numTrue = 0;
        if (a) {
            numTrue++;
        }
        if (b) {
            numTrue++;
        }
        if (c) {
            numTrue++;
        }
        if (numTrue % 2 == 1){
            return true;
        }
        return false;
    }

    public static boolean odd2(boolean a, boolean b, boolean c){
        // Exercise 2.1.2 - This method takes three boolean inputs and returns true if an odd number of inputs are true and false otherwise.
        return a ^ b ^ c;
    }

    public static boolean majority(boolean a, boolean b, boolean c){
        // Exercise 2.1.3 - This method takes three boolean inputs and returns true if at least two inputs are true and false otherwise.
        return a && (b || c) || (b && c);
    }





    public static void main(String[] args){
        StdOut.println(max3(3,4,3));
        StdOut.println(max3(3.0,4.10,3.5));
        StdOut.println(odd2(true, true, true));    // true
        StdOut.println(odd2(true, true, false));   // false
        StdOut.println(odd2(true, false, true));   // false
        StdOut.println(odd2(true, false, false));  // true
        StdOut.println(odd2(false, true, true));   // false
        StdOut.println(odd2(false, true, false));  // true
        StdOut.println(odd2(false, false, true));  // true
        StdOut.println(odd2(false, false, false)); // false
        StdOut.println();
        System.out.println(majority(true, true, true));    // true
        System.out.println(majority(true, true, false));   // true
        System.out.println(majority(true, false, true));   // true
        System.out.println(majority(true, false, false));  // false
        System.out.println(majority(false, true, true));   // true
        System.out.println(majority(false, true, false));  // false
        System.out.println(majority(false, false, true));  // false
        System.out.println(majority(false, false, false)); // false
    }

}
