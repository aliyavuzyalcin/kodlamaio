package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         This is a mini project which we can test the given number if it is a
 *         friendly number or not.
 * 
 *         A friendly number is a number that is a member of a friendly pair or
 *         a higher-order friendly n-tuple. Numbers that are not friendly are
 *         said to be solitary.
 */
public class MiniProjectFriendlyNumbers {
    public static void main(String[] args) {
        int number1 = 220;
        int number2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                sum1 = sum1 + i;
            }
        }

        for (int i = 1; i < number2; i++) {
            if (number2 % i == 0) {
                sum2 = sum2 + i;
            }
        }

        if (sum1 == number2 && sum2 == number1) {
            System.out.println(number1 + " and " + number2 + " is friendly number.");
        } else {
            System.out.println(number1 + " and " + number2 + " is NOT friendly number.");
        }
    }
}