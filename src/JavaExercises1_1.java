public class JavaExercises1_1 {
    public static void main(String[] args){
        tenHello();
        errorWorld();
        omitLetter();
        errorArgument();
        useThree(args);
    }

    public static void tenHello(){
        // Exercise 1.1.1 - Prints the Hello World message 10 times
        for (int i=0; i<10; i++){
            System.out.println("Hello, World!");
        }
    }

    public static void errorWorld(){
        // Exercise 1.1.2 - Experiments with the different type of run-time errors.
        System.out.println("1.1.2 - If public is omitted from HelloWorld, the compiler fails to find the main method in the class.");
        System.out.println("If static is omitted from HelloWorld, the compiler fails to find the main method in the class.");
        System.out.println("If void is omitted from HelloWorld, a syntax error occurs because the main method needs a return type.");
        System.out.println("If args is omitted from HelloWorld, a syntax error occurs because the parameter has a type but not an identifier.");
    }

    public static void omitLetter(){
        // Exercise 1.1.3 - Experiments with the different syntax errors that can arise.
        System.out.println("1.1.3 - If the second letter from any of the words is omitted from HelloWorld, the compiler will throw a syntax error.");
    }

    public static void errorArgument(){
        // Exercise 1.1.4 - Tries different argument types in the command line.
        System.out.println("1.1.4 - The output uses 'java' as a string. There is no error.");
        System.out.println("The output users '@!&^%' as a string. There is no error.");
        System.out.println("The output users '1234' as a string. There is no error.");
        System.out.println("The output users 'Bob' as a string. There is no error. Calling the program to be executed with or without the .java extension is irrelevant.");
        System.out.println("The output users 'Alice' as a string. An array is passed into the arguments. args[0] refers to the first element in that array so Alice is passed into main.");
    }

    public static void useThree(String[] args){
        // Exercise 1.1.5 - Takes 3 command line arguments and prints them in reverse order.
        System.out.println("Hi " + args[2] + ", " + args[1] + ", and " + args[0] + ".");
    }

}
