import java.util.Scanner;
/**
 * Write a java program to round the
 * elements of a matrix to the nearest num.
 *
 * @author : Prasamsa
 * Date: 1 September 2018
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //not used
    }
    /**
     * Function to round the
     * elements of a matrix to the nearest num.
     *
     * @param      a     Matrix of which the elements to be rounded
     * @param      rows     Number of rows
     * @param      columns     Number of columns
     *
     * @return     Matrix of the rounded elements
     */
    static int[][] roundHundred(final int[][] a, 
                                final int rows, final int columns) {
        final int num = 100;
        final int num1 = 50;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (a[i][j] < num) {
                    a[i][j] = num * Math.round(a[i][j] / num1);
                }
                else {
                    int sum = num * Math.round(a[i][j] / num1);
                    a[i][j] = sum / 2;
                    if (a[i][j] % num != 0) {
                        a[i][j] = a[i][j] + num1;
                    }
                }
                }
            }
            return a;
        }
    /**
     * Main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        int[][] b = roundHundred(a, m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println(b[i][n - 1]);
        }
    }
}
