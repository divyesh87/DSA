package PatternProbs;

//     *
//    **
//   *** 
//  **** 
// ***** 

public class p8 {
    public static void main(String[] args) {
        printPattern(5);
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j < (n - i)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    // Below line will print a pyramid
                    // System.out.print(" *");
                }
            }
            System.out.println("");
        }
    }
}
