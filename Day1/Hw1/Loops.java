package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find examples and syntax for the loops
 *         "while, for, do-while".
 */
public class Loops {
    public static void main(String[] args) {

        // for loop
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nFor loop is finished.");

        // while loop
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("\nWhile loop is finished.");

        // do-while
        int j = 0;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 10);
        System.out.println("\nDo-While is finished.");
    }
}
