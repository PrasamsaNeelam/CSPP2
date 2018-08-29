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
    private Solution() {

    }
/**
 * { main function }.
 *
 * @param      args  The arguments
 */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);  
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int rem;
            int a = 10;
            int b = 7;
            int val = i;
            do {
                rem = val % a;
                val = val / a;
                if (rem == b) {
                        count += 1;
                }
            } while (val > 0);
        }
        System.out.println(count); 
    }
}