import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] array = { 5, 3, 4, 2, 1 };
        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            while (array[i] != (i + 1)) {
                int temp = array[i];
                array[i] = array[temp - 1];
                array[temp - 1] = temp;
            }
        }

        return array;
    }
}
