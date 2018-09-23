import java.util.Scanner;
import java.io.File;
/**
 * solution - main class.
 */
public final  class Solution {
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
        try {
            Scanner linescan = new Scanner(System.in);

            String file = linescan.nextLine();
            //System.out.println(file);
            File new1 = new File(file);
            File[] text = new1.listFiles();
            double max = 0;
            String firstfile = "";
            String secondfile = "";

            System.out.print("             ");
            for (int i = 0; i < text.length - 1; i++) {
                System.out.print(text[i].getName() + "    ");
            }
            System.out.print(text[text.length - 1].getName() + " ");
            System.out.println();
            for (int i = 0; i < text.length; i++) {
                System.out.print(text[i].getName());
                for (int j = 0; j < text.length; j++) {
                    SubString1 obj = new SubString1();
                    double res = obj.plagerism(text[i], text[j]);

                    if (res > max && !text[i].getName().equals(text[j].getName())) {
                        max = res;
                        firstfile = text[i].getName();
                        secondfile = text[j].getName();

                    }

                }
                System.out.print(" ");
                System.out.println();

            }
            System.out.println("Maximum similarity is between "
                               + firstfile + " " + "and" + " " + secondfile);
        } catch (Exception e) {
            System.out.println("Empty Directory");
        }
    }
}
