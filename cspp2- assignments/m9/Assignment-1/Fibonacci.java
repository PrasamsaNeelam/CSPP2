/**
 * { Imports Scanner class }.
 * @author: Prasamsa
 * Date: September 5, 2018
 */
import java.util.Scanner;

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */

/**
 * Class for fibonacci.
 */
    public final class Fibonacci {
        /**
         * Constructs the object.
         */
        private Fibonacci() {

        }
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**
     * { function to list the fibonacci elements }.
     *
     * @param      n     { number of elements in the list }
     *
     * @return     { returns list }
     */
    static List fib(final int n) {
        int a = 0;
        int b = 1;
        List list = new List(n);
        list.add(a);
        list.add(b);
        for (int i = 0; i < n - 2; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            list.add(sum);
        }
        return list;
    }

    /**
     * { main function to read input and print fibonacci list }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}

