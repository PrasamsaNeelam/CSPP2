/**
* Finds the fourth power of the given number.
* Author: Prasamsa.
* Date: 28 august 2018
*/
import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        rootsOfQuadraticEquation(a, b, c);
    }
    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    static void rootsOfQuadraticEquation(final int a,
        final int b, final int c) {
        final int k = 4;
        double val = Math.sqrt((b * b) - (k * a * c));
        double root1 = ((-b) + val) / (2 * a);
        double root2 = ((-b) - val) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}

