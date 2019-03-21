package Creative_Exercises_1_2;

public class LoanPaymentCalculator {
    public static void main(String[] args){
        System.out.println("This program calculates the monthly payments you would be required to make over " + args[0] + " years to pay off a principal loan of " + args[1] + " at an interest rate of " + Double.parseDouble(args[2])*100 + "%.");
        System.out.println("The monthly payments would be " + paymentCalc(Integer.parseInt(args[0]),Double.parseDouble(args[1]),Double.parseDouble(args[2])));
    }

    public static double paymentCalc(int years, double principal, double i){
        // This formula is given by the textbook: Pe^(rt)
        return principal*Math.exp(i*years);
    }
}
