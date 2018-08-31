/**
 * { Imports scanner class }.
 * Author: Prasamsa
 * Date: 31 august 2018
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { main function }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String res = binaryToDecimal(str);
            System.out.println(res);
        }
    }
    /**
     * { main_function }.
     *
     * @param      str   The string
     *
     * @return     { returns string type }
     */
    static String binaryToDecimal(final String str) {
        int sum = 0, c = 0, val = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
        val = Character.getNumericValue(str.charAt(i));
        sum += val * Math.pow(2, c);
        c++;
    }
    return String.valueOf(sum);
}
}
