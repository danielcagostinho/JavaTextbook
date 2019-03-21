public class VisualRuler {
    public static void main(String[] args){
        // This program output a ruler of a size that is passed in through the command line arguments.
        int rulerSize = Integer.parseInt(args[0]);
        System.out.println(rulerTick(rulerSize));;

    }

    public static String rulerTick(int rulerSize){
        // This class uses recursion to create a ruler
        if (rulerSize == 1) { // Base case when size = 1
            String ticks = "";
            for (int i = 0; i < rulerSize; i++) {
                ticks = ticks + '-';
            }
            return rulerSize + " " + ticks;
        } else { // Recursive case
            String ticks = "";
            for (int i = 0; i < rulerSize; i++) {
                ticks = ticks + '-';
            }
            return rulerTick(rulerSize-1) + "\n" + rulerSize + " " + ticks + "\n" + rulerTick(rulerSize-1);
        }


    }
}
