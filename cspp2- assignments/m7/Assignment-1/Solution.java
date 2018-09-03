/**
 * { Imports the Scanner class }.
 * @author : Prasamsa
 * Date: September 3, 2018
 */
import java.util.Scanner;
/**
 * Class for input validator.
 */
class InputValidator {
    /**
     * { reads the input }.
     */
    private String input;
    /**
     * Constructs the object.
     *
     * @param      input  The input
     */
    public InputValidator(final String input) {
        this.input = input;
    }
    /**
     * { function to find the length of input }.
     *
     * @return     { returns boolean }
     */
    boolean validateData() {
        final int n = 6;
        if (input.length() >= n) {
            return true;
        }
        return false;
    }
}
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
     * { main function to read input and validate input }.
     */
    public static void main(final String args[]) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);       
        System.out.println(i.validateData());
    }

}
