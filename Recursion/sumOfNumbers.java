package Recursion;

public class sumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n > 0) {
            System.out.println(n + sum(n - 1));
            return n + sum(n - 1);
        } else {
            return 0;
        }
    }
}