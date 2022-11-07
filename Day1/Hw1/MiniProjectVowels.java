package Day1.Hw1;


/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         This is a mini project where we can test a given letter if it is a
 *         high vowel or low vowel.
 */
public class MiniProjectVowels {
    public static void main(String[] args) {

        char letter = 'I';

        switch (letter) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Low vowel.");
                break;
            case 'E':
            case 'İ':
            case 'Ü':
            case 'Ö':
                System.out.println("High vowel.");
                break;
            default:
                System.out.println("Enter a vowel.");
                break;
        }
    }
}
