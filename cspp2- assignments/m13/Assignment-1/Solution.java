import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author : Prasamsa
 * Date: September 8, 2018
 */
class Set {
    private int[] set;
    private int size;
    /**
     * Constructs the object.
     */
    public Set() {
        set = new int[10];
        size = 0;
    }
    /**
     * Constructs the object.
     *
     * @param      capacity  The capacity
     */
    public Set(int capacity) {
        set = new int[capacity];
        size = 0;
    }

    /**
     * helper function to convert string input to int array.
     *
     * @param      s     { string input from test case file }
     *
     * @return     { int array from the given string }
     */
    public int[] intArray(final String s) {
        String input = s;
        if (input.equals("[]")) {
            return new int[0];
        }
        if (s.contains("[")) {
            input = s.substring(1, s.length() - 1);
        }
        return Arrays.stream(input.split(","))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    }

    private void resize() {
        int[] newset = new int[set.length * 2];
        System.arraycopy(set, 0, newset, 0, set.length);
        set = newset;
    }

    public int size() {
        return size;
    }

    public boolean contains(final int item) {
        for (int i = 0; i < set.length; i++) {
            if (set[i] == item) {
                return true;
            }
        }
        return false;
    }

    public String print() {
        if (size == 0) {
            return "{}";
        }
        String str = "{";
        int i = 0;
        for (i = 0; i < size; i++) {
            str += set[i] + ",";
        }
        str += set[i] + "}";
        return str;
    }

    public void add(final int item) {
        if (size == set.length) {
            resize();
        } else {
            set[size++] = item;
        }
    }

    public void add(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (size == set.length) {
                resize();
            } else {
                set[size++] = array[i];
            }
        }
    }

    public int get(final int index) {
        if (index < 0 && index > size) {
            return -1;
        }
        return set[index];

    }

    public Set intersection(final Set set1) {
        Set fset = new Set();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < set1.size; j++) {
                if(set[i] == set1.get(j)) {
                    fset.add(set[i]);
                }
            }
        }
        return fset;
    }

    public Set retainAll(final int[] array) {
        Set fset = new Set();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] == set[j]) {
                    fset.add(set[j]);
                }
            }
        }
        return fset;
    }

    // public int[][] cartesianProduct(Set a) {
    //     int[][] farray = new int[10][10];
    //     for (int i = 0; i < size; i++) {
    //         for (int j = 0; j < a.length; j++) {
    //             System.out.println(farray = Array[set[i], a[j]]);
    //         }
    //     }
    // }

/**
 * Solution class for code-eval.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        
    }
    
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public void main(final String[] args) {
        // instantiate this set
        Set s = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the set operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
                break;
                case "print":
                System.out.println(s);
                break;
                case "add":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    //changed from s.add(intArray);
                    s.add(intArray);
                }
                break;
                case "intersection":
                s = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                //changed from s.add(intArray);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                //changed from t.add(intArray);
                t.add(intArray);
                System.out.println(s.intersection(t));
                break;
                case "retainAll":
                s = new Set();
                intArray = intArray(tokens[1]);
                //changed from s.add(intArray);
                s.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s.retainAll(intArray));
                break;
                // case "cartesianProduct":
                // s = new Set();
                // t = new Set();
                // intArray = intArray(tokens[1]);
                // //changed from s.add(intArray);
                // s.add(intArray[1]);
                // intArray = intArray(tokens[2]);
                // //changed from t.add(intArray);
                // t.add(intArray[2]);
                // System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                // break;
                default:
                break;
            }
        }
    }
}
}


