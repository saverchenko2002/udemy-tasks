public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay > 23 || hourOfDay < 0 || !barking) {
            return false;
        }
        return hourOfDay > 22 || hourOfDay < 8;
    }
}
