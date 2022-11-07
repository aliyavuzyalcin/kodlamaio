package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find an example of "Multidimensional Arrays". In this
 *         example, we display the city names and region names.
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[][] cities = new String[3][3];

        cities[0][0] = "Ankara";
        cities[0][1] = "Konya";
        cities[0][2] = "Çankırı";
        cities[1][0] = "İzmir";
        cities[1][1] = "Manisa";
        cities[1][2] = "Aydın";
        cities[2][0] = "İstanbul";
        cities[2][1] = "Balıkesir";
        cities[2][2] = "Yalova";

        for (int i = 0; i < cities.length; i++) {
            if (i == 0) {
                System.out.println("CENTRAL ANATOLIA");
            } else if (i == 1) {
                System.out.println("AEGEAN ANATOLIA");
            } else if (i == 2) {
                System.out.println("MARMARA REGION");
            }

            for (int j = 0; j < cities[i].length; j++) {

                System.out.println("- " + cities[i][j]);
            }
            System.out.println();
        }

    }
}
