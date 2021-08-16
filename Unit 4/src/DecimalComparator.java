public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
        int multiplier = 10_000;
        int digitsCount = 3;
        if (first * second < 0) {
            return false;
        } else {
            first *= multiplier;
            second *= multiplier;
            for (int i = digitsCount; i > 0; i--) {
                System.out.println(first/Math.pow(10,i));
                if ((int) (first / (Math.pow(10, i))) == (int) (second / (Math.pow(10, i)))) {
                    continue;
                } else return false;
            }
            return true;
        }
    }
}
