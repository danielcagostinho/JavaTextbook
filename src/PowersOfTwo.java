public class PowersOfTwo {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        int v = 1;
        int i = 0;
        while (i <= N){
            // Print ith power of 2
            System.out.println(i + " " + v);
            v = 2 * v;
            i = i + 1;
        }

    }
}
