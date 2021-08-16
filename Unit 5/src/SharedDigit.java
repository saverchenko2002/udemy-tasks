import java.util.*;

public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if ((first<10 || second>99) && (first>99 || second <10)) {
            return false;
        }
        int secondCopy = second;
        int firstDigitToCompare = 0;
        int secondDigitToCompare = 0;
        while (first!=0) {
            secondCopy = second;
            firstDigitToCompare=first%10;
            first/=10;
            while(secondCopy!=0) {
                secondDigitToCompare=secondCopy%10;
                secondCopy/=10;
                if (firstDigitToCompare==secondDigitToCompare) {
                    return true;
                }
            }
        }
        return false;
    }
}