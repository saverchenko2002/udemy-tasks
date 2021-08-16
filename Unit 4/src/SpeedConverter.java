public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        double conversionRate = 1.609;
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / conversionRate);
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = "
                + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}