/**
 * { imports Scanner class }.
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
     * { main function to read input and to reverse the given string }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverseString(s);
        System.out.println(reverse);
    }
    /**
     * { function to reverse the given string }.
     *
     * @param      s     { parameter_description: s is the given string }
     *
     * @return     { returns a string }
     */
    static String reverseString(final String s) {
        String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev;
    }
}
