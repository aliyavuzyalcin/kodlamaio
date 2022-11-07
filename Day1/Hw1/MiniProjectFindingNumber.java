package Day1.Hw1;

/**
 * @author Ali Yavuz Yalcin
 *         ---------------
 *         Date: 7.11.2022
 *         ---------------
 *         Prepared for kodlama.io
 *         ---------------
 *         This is a mini project which we can search a number through an array.
 * 
 */
public class MiniProjectFindingNumber {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0};
        int search = 3;
        boolean isThere = true;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == search){
                isThere = true;
            }else{
                isThere = false;
            }
        }
        if(isThere == true){
            System.out.println(search + " is exist.");
        }else{
            System.out.println(search + " is NOT exist.");
        }

    }
}
