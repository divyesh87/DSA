package PatternProbs;

public class p5 {
    public static void main(String[] args) {
        printPattern(10);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            if (i < (n / 2)) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println("");
            } else {
                for (int k = i; k < n; k++) {
                    System.out.print("*");
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
