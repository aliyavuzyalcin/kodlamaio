package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         This is a mini project where we can test a given number if it is a
 *         prime number or not.
 */
public class MiniProjectPrimeNumber {
    public static void main(String[] args) {

        int number = 0;
        //int reminder = number % 2;
        boolean isPrime = true;

        if (number < 0) {
            System.out.println("Please enter a positive number!");
            isPrime = false;
        } else if (number == 0 || number == 1) {
            System.out.println("Please enter bigger number!");
            isPrime = false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println(number + " is PRIME NUMBER.");
        } else {
            System.out.println(number + " is NOT PRIME NUMBER.");
        }

    }
}
