package PatternProbs;

public class p6 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j <= (n - 1) - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}
