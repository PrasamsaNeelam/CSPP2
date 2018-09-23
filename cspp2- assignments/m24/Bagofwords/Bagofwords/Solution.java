import java.util.Scanner;
import java.io.File;
//import java.util.Arrays;
import java.util.HashMap;
/**
 * Class for bagofwords.
 */
class Bagofwords {
    /**
     * { var_description }.
     */
    private  HashMap<String, Integer>dictionary;
    /**
     * Constructs the object.
     */
    Bagofwords() {
        dictionary = new HashMap<>();
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public HashMap<String, Integer> gedictionary() {
        return dictionary;
    }
    /**
     * { function_description }.
     *
     * @param      finald1  The finald 1
     * @param      finald2  The finald 2
     *
     * @return     { description_of_the_return_value }
     */
    public long plagerism(final HashMap<String, Integer> finald1,
                          final  HashMap<String, Integer> finald2) {

        double num = 0;
        for (String key1 : finald1.keySet()) {
            for (String key2 : finald2.keySet()) {
                if (key1.equals(key2)) {
                    num += (finald1.get(key1) * finald2.get(key2));

                }
            }
        }

        int squ1 = 0;
        for (String key1 : finald1.keySet()) {
            squ1 += Math.pow(finald1.get(key1), 2);

        }
        int squ2 = 0;
        for (String key2 : finald2.keySet()) {
            squ2 += Math.pow(finald2.get(key2), 2);
        }
        double den = 0;
        den = Math.sqrt(squ1) * Math.sqrt(squ2);
        final int hun = 100;
        //System.out.print(" " + num + " "+ den + " " );
        double finalresult = ((num * hun) / den);
        finalresult = Math.round(finalresult);
        return (long) (finalresult);
    }



}
/**
 * Class for solution.
 */

final  class Solution {
    /**
     * Class for solution.
     */
    private Solution() { };
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        int first = 0, second = 0;
        double max = 0.0;
        try {
            Scanner linescan = new Scanner(System.in);
            String filename = linescan.nextLine();
            //System.out.println(filename);
            File firstfile = new File(filename);
            File[] files = firstfile.listFiles();
            // for(File i : files){
            //     System.out.println(i);
            // // }
            System.out.print("\t" + "\t");
            for (File file : files) {
                System.out.print(file.getName() + "\t");
            }
            System.out.println();
            for (int i = 0; i < files.length; i++) {
                System.out.print(files[i].getName() + "\t");
                for (int j = 0; j < files.length; j++) {
                    Bagofwords finalobj = new Bagofwords();

                    // File file1 = new File(files[i]);
                    Scanner scn = new Scanner(files[i]);
                    HashMap<String, Integer> final1 = new HashMap<>();
                    String[] p1;
                    String string1 = null;
                    while (scn.hasNext()) {
                        string1 = scn.useDelimiter("\\A").next();


                    }
                    if (string1 != null) {
                        p1 = string1.toLowerCase().split(" ");
                        final1 = countfreq(p1);
                        int  keyscount = final1.keySet().size();
                    }
                    scn.close();
                    // File file2 = new File("test2.txt");
                    Scanner scn1 = new Scanner(files[j]);
                    HashMap<String, Integer> final2 = new HashMap<>();
                    String[] p2;
                    String string2 = null;
                    while (scn1.hasNext()) {
                        string2 = scn1.useDelimiter("\\A").next();
                    }
                    if (string2 != null) {
                        p2 = string2.toLowerCase().split(" ");
                        final2 = countfreq(p2);
                    }
                    scn1.close();
                    double resultpercent = finalobj.plagerism(final1, final2);
                    resultpercent = Math.round(resultpercent);

                    System.out.print((long) resultpercent + "\t\t");
                    if (resultpercent > max && i != j) {
                        max = resultpercent;
                        first = i;
                        second = j;
                    }

                }
                System.out.println();
            }
            System.out.println("Maximum similarity is between "
                               + files[first].getName() + " " + "and" + " " + files[second].getName());





        } catch (Exception e) {
            System.out.println("empty directory");
        }
    }
    /**
     * { function_description }.
     *
     * @param      array  The array
     *
     * @return     { description_of_the_return_value }.
     */
    public static  HashMap<String, Integer> countfreq(final String[] array) {
        Bagofwords obj1 = new Bagofwords();
        for (int i = 0; i < array.length; i++) {
            int value = 1;
            if (obj1.gedictionary().containsKey(array[i])) {
                value = obj1.gedictionary().get(array[i]) + 1;
            }
            obj1.gedictionary().put(array[i], value);
        }
        //System.out.println(obj1.gedictionary());
        return obj1.gedictionary();
    }
}
