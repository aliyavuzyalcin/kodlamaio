package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find "Switch" conditional and its syntax with
 *         an example.
 */
public class Conditionals2 {
    public static void main(String[] args) {
        
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Passed! Your grade is 'A'.");
                break;
            case 'B':
            case 'C':
                System.out.println("Passed! Your grade is 'B'.");
                break;
            case 'D':
                System.out.println("Passed! Your grade is 'C'.");
                break;
            case 'F':
                System.out.println("Failed! Your grade is 'F'.");
                break;
            default:
                System.out.println("Enter a valid grade letter.");
                break;
        }
    }
}
