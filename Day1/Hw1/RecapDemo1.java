package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find an example of "If statement." This
 *         example takes three different numbers and assign the first number to
 *         "greater" variable. So, we will be able to compare each other. If
 *         "number1" is smaller than "number2", then "greater" will be number2
 *         and so on. Lastly, we will display the result.
 */
public class RecapDemo1 {
    public static void main(String[] args) {
        int number1 = 32;
        int number2 = 25;
        int number3 = 4;

        int greater = number1;
        if (greater < number2) {
            greater = number2;
        } else if (greater < number3) {
            greater = number3;
        }
        System.out.println("The great number is: " + greater);
    }
}
