import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            if (scanner.hasNextInt()) {
                array[i] = scanner.nextInt();
            }
        }
        return array;
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("Element %d contents %d", i, inputArray[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        System.arraycopy(unsortedArray, 0, sortedArray, 0, unsortedArray.length);
        int temp = 0;
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sortedArray.length; j++) {
                if (sortedArray[i] > sortedArray[j] && i != j) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}