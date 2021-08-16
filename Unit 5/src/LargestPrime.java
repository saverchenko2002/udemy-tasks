public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        boolean flag = false;
        int maxPrime = 0;
        for (int pretender = 2; pretender <= number; pretender++) {
            if (number % pretender == 0) {
                flag = true;
                for (int j = 2; j <= pretender / 2; j++) {
                    if (pretender % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    maxPrime = pretender;
                }
            }
        }
        return maxPrime;
    }
}
