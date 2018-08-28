/**
 * { item_description }.
 * Author : Prasamsa
 * Date: 28 august 2018
 */
import java.util.Scanner;
/**
 * Class for area of circle.
 */
class area_of_Circle
{
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	int radius = scan.nextInt();
	System.out.println(area(radius));
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    static double pi()
    {
        return 3.14;
    }
    // int radius = 10;
    static double area(int radius)
    {
    	double result = pi()*radius*radius;
    	return result;
    }
}
