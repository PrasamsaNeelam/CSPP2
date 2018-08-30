/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 30 august 2018
 */
import java.util.*;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * { main_function }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
