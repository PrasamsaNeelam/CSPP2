/**
* Author: Prasamsa
* Date: 28 august 2018
* Finds the fourth power of the given number
*/
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		rootsOfQuadraticEquation(a, b, c);
	}
	/*
	Need to write the rootsOfQuadraticEquation function and print the output.
	*/
	static void rootsOfQuadraticEquation(int a, int b, int c)
	{
		double val = Math.sqrt((b*b) - 4*a*c);
		double root1 = ((-b) + val)/(2*a);
		double root2 = ((-b) - val)/(2*a);
        System.out.println(root1 + "," + root2);
	}
}
