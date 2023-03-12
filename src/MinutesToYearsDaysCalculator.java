public class MinutesToYearsDaysCalculator {
    // write your code here
    public static void printYearsAndDays(long minutes) {
        double yearsToMinutes = 5_25_600.0;
        double daysToMinutes = 1440d;
        if (minutes < 0)
            System.out.println("Invalid Value");
        else {
            int years = (int)(Math.floor((double) minutes / yearsToMinutes));
            int days = (int)(Math.floor((minutes % yearsToMinutes)/daysToMinutes));
            int minutesRemaining = (int)(((minutes % yearsToMinutes)%daysToMinutes));
            System.out.println(minutes+" min = "+years+" y and "+days+" d");
        }
    }
}