public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        final long MINUTES_IN_YEAR = 24 * 60 * 365;
        final long MINUTES_IN_DAY = 24 * 60;
        int years = (int) Math.floor(minutes / MINUTES_IN_YEAR);
        int days = (int) Math.floor((minutes - years * MINUTES_IN_YEAR) / MINUTES_IN_DAY);
        System.out.printf("%d min = %d y and %d d%n", minutes, years, days);
    }
}