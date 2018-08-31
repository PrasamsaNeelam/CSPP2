/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 31 august 2018
 */
import java.util.Scanner;
/**
 * Class for concatinate.
 */
class Concatinate {
    /**
     * Constructs the object.
     */
    private Concatinate() {

    }
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String str1 = "Hello";
        str1 = str1.concat(" " + str + "!");
        System.out.println(str1);
    }
}
