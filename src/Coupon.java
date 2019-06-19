public class Coupon {

    public static int uniform(int N) {
        // Generate a random integer between 0 and  N - 1.
        return (int) (Math.random()*N);
    }

    public static int collect(int N) {
        // Collect coupons until getting one of each value.
        boolean[] found = new boolean[N];
        int cardcnt = 0, valcnt = 0;
        while (valcnt < N){
            int val = uniform(N);
            cardcnt++;
            if (!found[val]) {
                valcnt++;
            }
            found[val] = true;
        }
        return cardcnt;
    }

    public static void main(String[] args) {
        // Print the number of coupons collected to get to N different coupons
        Integer[] testSet = new Integer[]{1000, 1000, 1000000};
        testSuite(testSet);
    }

    public static void testSuite(Integer[] testSet){
        for (int testCase : testSet) {
            int count = collect(testCase);
            System.out.println(count);

        }
    }


}
