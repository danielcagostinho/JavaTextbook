package Creative_Exercises_1_2;

public class DayofWeek {

    public static void main(String[] args){
        // Exercise 1.2.29 - Takes 3 command line arguments for day month and year and returns the day of week for that date.
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int y0 = y-(14-m)/12;
        int x = y0 + y0/4-y0/100 + y0/400;
        int m0 = m+12 *((14-m)/12)-2;
        int d0 = (d + x + (31*m0)/12)%7;
        System.out.println("The " + d + " of " + getMonth(m) + " of the year " + y + " falls on a " + getDay(d0));
    }

    public static String getMonth(int m){
        switch (m){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "";
    }

    public static String getDay(int d){
        switch (d){
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
        }
        return "";
    }

}
