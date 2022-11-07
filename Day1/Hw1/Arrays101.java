package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         In this Java class, you can find an example of "String Array". The
 *         elements of the array displayed using with for loop and foreach loop.
 */
public class Arrays101 {
    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Bob";
        students[1] = "Alice";
        students[2] = "John";
        students[3] = "Jack";

        System.out.println("Students: ");

        // With FOR LOOP
        for (int i = 0; i < students.length; i++) {
            System.out.println("- " + students[i]);
        }

        System.out.println();

        // With WHILE FOREACH LOOP
        for (String student : students) {
            System.out.println("- " + student);
        }

    }
}
