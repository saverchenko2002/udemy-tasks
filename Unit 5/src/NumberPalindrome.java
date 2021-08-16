public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number<0) {
            number*=-1;
        }
        int num = number;
        int multiplier = 0;
        while (num/10!=0) {
            num/=10;
            multiplier++;
        }
        num=number;
        int reverse = 0;
        for (int i = multiplier; i >= 0; i--) {
            reverse += (number%10)*Math.pow(10,i);
            number/=10;
        }
        return (reverse==num);
    }
}