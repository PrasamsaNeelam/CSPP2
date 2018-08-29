/**
 * { item_description }.
 * Author: Prasamsa
 * Date: 29 august 2018
 */
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
    /**
     * Class for solution.
     */
public class Solution {
    private Solution() {

    }
    /**
     * { main function }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1,n2));
    }
    /*
	Need to write the gcd function and print the output.
	*/
    /**
     * { function_description }.
     *
     * @param      n1    The n 1
     * @param      n2    The n 2
     *
     * @return     { returns int type }
     */
    static int gcd(int n1, int n2) {
        for (int i = Math.max(n1, n2); i >= 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}

