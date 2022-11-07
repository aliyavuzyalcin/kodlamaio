package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find "if" statements and its syntax with
 *         an example.
 */
public class Conditionals {
    public static void main(String[] args) {

        int number = 21;

        if (number < 10) {
            System.out.println("Number is smaller than 10.");
        } else if (number < 20) {
            System.out.println("Number is smaller than 20");
        } else {
            System.out.println("Number is greater than 20.");
        }
    }
}
