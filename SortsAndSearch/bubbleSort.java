import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 9, 6, 7, 1, 2 };
        int[] ans = bubble(array);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] bubble(int[] array) {
        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] < array[i]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}
