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
     * @param      input1  The input
     */
    InputValidator(final String input1) {
        this.input = input1;
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
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function to read the input and validate the data }.
     * @param       args    The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        InputValidator i = new InputValidator(input);
        System.out.println(i.validateData());
    }

}

