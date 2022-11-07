package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         This is a mini project which we can test the given number if it is a
 *         perfect number or not.
 * 
 *         A perfect number is In mathematics, the sum of the positive divisors
 *         of some positive integers is equal to twice the number itself. Such
 *         numbers are called "perfect numbers".
 */
public class MiniProjectPerfectNumbers {
    public static void main(String[] args) {
        int number = 8128;
        // boolean isPerfect = true;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is perfect.");
        } else {
            System.out.println(number + " is NOT perfect.");
        }
    }
}
