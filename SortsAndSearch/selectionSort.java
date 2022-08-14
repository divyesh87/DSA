import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 9, 6, 7, 1, 2 };
        int[] ans = selection(array);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] selection(int[] array) {
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; i++) {
            smallest = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] <= smallest) {
                    smallest = array[j];
                    smallestIndex = j;
                }
            }
            int temp = array[smallestIndex];
            array[smallestIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
