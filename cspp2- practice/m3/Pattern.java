/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 29 august 2018
 */
import java.util.Scanner;
/**
 * Class for pattern.
 */
class Pattern
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
		for (int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
		System.out.println();
		}
	}
}