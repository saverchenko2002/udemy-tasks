public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int numCopy=number;
        int digitCount = 0;
        while(numCopy/10!=0) {
            digitCount++;
            numCopy/=10;
        }
        return (number%10 + number/(int)Math.pow(10,digitCount));
    }
}