public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)) {
            return false;
        }
        return (first % 10 == second % 10) || (first % 10 == third % 10) || (second % 10 == third % 10);
    }

    public static boolean isValid(int number) {
        return number >= 10 && number <= 1000;
    }
}