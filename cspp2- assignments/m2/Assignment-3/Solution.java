/**
 * { item_description }.
 * Name: Prasamsa
 * Date: 28 august 2018
 */
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { function_description }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);      
        int base = s.nextInt();
        int exponent = s.nextInt();
        int result = power(base,exponent);
        System.out.println(result);
	}
	/**
	 * { function_description }.
	 *
	 * @param      base      The base
	 * @param      exponent  The exponent
	 *
	 * @return     { description_of_the_return_value }
	 */
	static int power(int base, int exponent) {
	if(exponent == 0)
	{
		return 1;
	}	 
	else
	{
		return base * power(base, exponent - 1);
	}
	}
}
