import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
            count++;
        }
        scanner.close();
        System.out.printf("SUM = %d AVG = %d%n", sum, Math.round((float) sum / count));
    }
}