public class missingNum {
    public static void main(String[] args) {
        int[] array = { 4, 3, 0, 5, 2 };
        System.out.println(sort(array));
    }

    public static int sort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            while (array[i] != (i)) {
                if (array[i] >= array.length) {
                    break;
                }
                int temp = array[i];
                array[i] = array[temp];
                array[temp] = temp;
            }
        }

        return getMissingNum(array);
    }

    public static int getMissingNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
        }
        return -1;
    }
}
