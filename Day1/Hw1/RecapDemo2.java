package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find an example of "Arrays". In this
 *         example, we find the biggest number and the total sum of the array.
 */
public class RecapDemo2 {
    public static void main(String[] args) {
        double[] myList = { 1.2, 6.3, 4.3, 5.6 };
        double sum, max;
        sum = 0;
        max = myList[0];

        for (int i = 0; i < myList.length; i++) {
            if (max < myList[i]) {
                max = myList[i];
            }
            sum = sum + myList[i];
        }

        System.out.println("Biggest number: " + max);
        System.out.println("Sum: " + sum);
    }
}
