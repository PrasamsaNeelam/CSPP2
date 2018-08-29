/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 29 august 2018
 */
import java.util.Scanner;
/**
 * Class for sum of n numbers.
 */
class SumOfNNumbers
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
     int sum = 0;
     for (int i = 1; i <= n; i++)
     {
         sum += i;
     }
     System.out.println(sum);
	}
}