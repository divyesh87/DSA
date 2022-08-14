package Recursion;

public class binarySearch {
    public static void main(String[] args) {

        int[] array = { 1, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(array, 2, 0, array.length - 1));
    }

    public static int search(int[] array, int target, int s, int e) {

        if (s > e) {
            return -1;
        }
        int m = (s + e) / 2;
        if (target == array[m]) {

            return m;
        }
        if (target < array[m]) {
            return search(array, target, s, m - 1);
        }

        return search(array, target, m + 1, e);

    }
}
