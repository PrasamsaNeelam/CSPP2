/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 29 august 2018
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
/**
 * { main function }
 *
 * @param      args  The arguments
 */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);      
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int rem;
            int val = i;
            do{
                rem = val % 10;
                val = val / 10;
                if (rem == 7) {
                        count += 1;
                }
            } while (val > 0);
        }
        System.out.println(count);      
    }
}