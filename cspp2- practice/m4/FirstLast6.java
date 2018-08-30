/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 30 august 2018
 */
import java.util.Scanner;
/**
 * Class for first last 6.
 */
class FirstLast6
{
	/**
	 * { function_description }
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args)
	{
		System.out.println("Enter size of the array: ");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < size; i++)
		{
			arr[i] = s.nextInt();
		}
    	if (arr[0] == 6 || arr[size-1] == 6)
    	{
    		System.out.println(true);
    	}
    	else {
    		System.out.println(false);
    	}
    }
}

