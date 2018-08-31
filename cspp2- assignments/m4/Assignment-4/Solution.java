/**
 * { To import Scanner class }.
 * Author: Prasamsa
 * Date: 31 august 2018
 */
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
/*
	Do not modify the main function 
	*/
	/**
	 * { main_function }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String reverse = reverseString(s);	
		System.out.println(reverse);
	}
	static String reverseString(String s) {
		String rev = "";
        for (int i = 0; i < s.length(); i++) {
            rev = s.charAt(i) + rev;
        }
        return rev;
	}
}
