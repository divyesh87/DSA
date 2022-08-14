package Recursion;

public class fibonacci {
    // fibo series = [0,1,1,2,3,5,8,13]
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
