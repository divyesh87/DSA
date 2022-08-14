package PatternProbs;

public class z {
    public static void main(String[] args) {
        printPattern(50);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int k = 0; k < n; k++) {
                    if (k == (n - 1) - i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
