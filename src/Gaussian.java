public class Gaussian {

    public static double phi(double x) {
        return Math.exp(-x*x/2) / Math.sqrt(2*Math.PI);
    }

    public static double Phi(double z) {
        if (z < -8.0){
            return 0.0;
        }

        if (z > 8.0){
            return 1.0;
        }

        double sum = 0.0, term = z;
        for (int i = 3; sum != sum + term; i += 2) {
            sum = sum + term;
            term = term * z * z / i;
        }
        return 0.5 + phi(z) * sum;
    }

    public static void main(String[] args) {
        Double[][] testSet = new Double[][]{{820.0, 1019.0, 209.0}, {1500.0, 1019.0, 209.0}, {1500.0, 1025.0, 231.0}};
        testSuite(testSet);
    }


    public static void testSuite(Double[][] testSet){
        for (Double[] testCase : testSet) {
            double z = testCase[0];
            double mu = testCase[1];
            double sigma = testCase[2];
            System.out.printf("%.3f\n", Phi((z - mu) / sigma));

        }
    }

}
