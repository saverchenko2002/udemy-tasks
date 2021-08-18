import java.util.Scanner;

public class MinimumElement {
    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        return scanner.hasNextInt() ? scanner.nextInt() : -1;
    }

    private static int[] readElements(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.hasNextInt() ? scanner.nextInt() : -1;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }
}
