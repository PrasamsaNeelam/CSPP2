/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 30 august 2018
 */
import java.util.Scanner;
/**
 * Class for average.
 */
class Average
{
    /**
     * { main_function }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args)
    {
        System.out.println("Enter the size of array: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("The average of array elements: ");
        float sum = 0f;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        float avg = sum / size;
        System.out.println(avg);
    }
}