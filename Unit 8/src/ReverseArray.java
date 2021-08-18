import java.util.Arrays;

public class ReverseArray {
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int halfSize;
        int temp;
        halfSize = array.length / 2;
        for (int i = 0; i < halfSize; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
