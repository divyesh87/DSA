package PatternProbs;

public class p4 {
    public static void main(String[] args) {
        printPattern(5);
    }

    public static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
