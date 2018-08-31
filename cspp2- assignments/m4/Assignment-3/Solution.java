
// Given an String, Write a java method that returns the decimal value for the given binary string.

import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
/**
* { item_description }.
*/
    /*
    Do not modify this main function.
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            String res = binaryToDecimal(str);//Write binaryToDecimal function
            System.out.println(res);
        }
    }
    static String binaryToDecimal(String str) {
        int sum = 0, c = 0, val = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
        val = Character.getNumericValue(str.charAt(i));
        sum += val * Math.pow(2, c);
        c++;
    }
    return String.valueOf(sum);
}

}
