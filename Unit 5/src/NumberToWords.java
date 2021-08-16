public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        int digitsCount = getDigitCount(number);
        number = reverse(number);
        int currentDigit = 0;
        for (int i = digitsCount - 1; i >= 0; i--) {
            currentDigit = number % 10;
            number /= 10;
            switch (currentDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number==0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    public static int reverse(int number) {
        boolean negativeFlag = false;
        if (number<0) {
            negativeFlag = true;
            number*=-1;
        }

        int digitCount = getDigitCount(number);

        int reverse = 0;
        for (int i = digitCount - 1; i >= 0; i--) {
            reverse += (number % 10) * Math.pow(10, i);
            number /= 10;
        }
        if (negativeFlag) {
            return reverse*-1;
        }
        else return reverse;
    }
}