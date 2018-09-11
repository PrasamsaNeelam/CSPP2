/**.
 * Creates a input stream
 */
import java.io.BufferedInputStream;
/**.
 * Scanner class for taking the input
 */
import java.util.Scanner;
/**.
 * for array operations
 */
import java.util.Arrays;

/**.
 * Class for set.
 * @author : Prasamsa
 * Date: September 10, 2018
 */
class InvalidSubsetSelectionException extends Exception {
    InvalidSubsetSelectionException(String s){
        super(s);
    }
}
class Solution extends Set {
    /**.
     * Function to find the last element in the set
     *
     * @return  item in the set
     * @throws     Exception { set empty exception }
     */
    public int last() throws Exception {
        // System.out.println(size()+" size");
        if (size() == 0) {
            throw new Exception();
        } else {
            return get(size() - 1);
        }
    }
    /**.
     * Function to get the elements from start to  given to element
     *
     * @param      toele  The toele
     *
     * @return Set of elements upto the required element that is passed as
     */
    public int[] headset(final int toele) throws Exception{
        int[] subset=subSet(get(0), toele);
        if(subset.length==0){
            throw new Exception();
        }
        return subset;
    }
    /**.
     * Subset function
     *
     * @param      fromele  The fromele
     * @param      toele    The toele
     *
     * @return  array
     */
    public int[] subSet(final int fromele, final int toele) throws InvalidSubsetSelectionException{
        if(fromele>toele) {
            throw new InvalidSubsetSelectionException("Invalid Arguements to Subset Exception");
        }
        int fromindex = getIndex(fromele);
        int toindex = getIndex(toele);
        int[] subset = new int[toindex - fromindex];
        int k = 0;
        for (int i = fromindex; i < toindex; i++) {
                subset[k++] = this.get(i);
        }
        return subset;
    }
    /**.
     * Add function to add the elements into the set
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (!contains(item)) {
            int index = getIndex(item);
            add(index, item);
        }
    }
    /**.
     * Gets the index.
     *
     * @param      item  The item
     *
     * @return     The index.
     */
    public int getIndex(final int item) {
        for (int i = 0; i < size(); i++) {
            if (item <= this.get(i)) {
                return i;
            }
        }
        return size();
    }
    /**.
     * { function_description }
     *
     * @param      s     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static int[] intArray(final String s) {
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
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Solution s = new Solution();
        Set s1 = new Set();
        // code to read the test cases input file
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));
        // check if there is one more line to process
        while (stdin.hasNext()) {
            // read the line
            String line = stdin.nextLine();
            // split the line using space
            String[] tokens = line.split(" ");
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
            case "size":
                System.out.println(s.size());
                break;
            case "contains":
                System.out.println(s.
                    contains(Integer.parseInt(tokens[1])));
                break;
            case "print":
                System.out.println(s);
                break;
            case "addAll":
                int[] intArray = intArray(tokens[1]);
                if (intArray.length == 1) {
                    s.add(intArray[0]);
                } else {
                    s.add(intArray);
                }
                break;
            case "subSet":
                String[] arrstring = tokens[1].split(",");
                try{
                    int[] subarray = s.subSet(Integer.parseInt(arrstring[0]),
                            Integer.parseInt(arrstring[1]));
                    Set subset = new Set();
                    subset.add(subarray);
                    if (subset != null) {
                        System.out.println(subset);
                    }
                }
            
            catch(InvalidSubsetSelectionException e){
                System.out.println("Invalid Arguments to Subset Exception");
            }
            break;
            case "headSet":
            try {
                int[] headarray = s.headset(Integer.parseInt(tokens[1]));
                Set headset = new Set();
                headset.add(headarray);
                if (headset != null) {
                    System.out.println(headset);
                }
            }
            catch(Exception e){
                System.out.println("Set Empty Exception");
            }
            break;
            case "intersection":
                s1 = new Set();
                Set t = new Set();
                intArray = intArray(tokens[1]);
                // System.out.println(Arrays.toString(intArray));
                s1.add(intArray);
                intArray = intArray(tokens[2]);
                t.add(intArray);
                System.out.println(s1.intersection(t));
                break;
            case "retainAll":
                // s1 = new Set();
                intArray = intArray(tokens[1]);
                s1.add(intArray);
                intArray = intArray(tokens[2]);
                System.out.println(s1.retainAll(intArray));
                break;
            case "last":
            try{
                System.out.println(s.last());
            }
            catch(Exception e) {
                System.out.println("Set Empty Exception");
            }
            break;
            default:
                break;
            }
        }
    }
}