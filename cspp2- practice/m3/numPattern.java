/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 29 august 2018
 */
import java.util.Scanner;
/**
 * Class for number pattern.
 */
class numPattern
{
	/**
	 * { main function }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args)
	{
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n; i >= 1 ; i--) {
        	for (int j = i; j >= 1; j--) {
        		System.out.print(j + " ");
        	}
        System.out.println();
        }
	}
}