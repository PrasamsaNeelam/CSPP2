import java.util.Scanner;
import java.io.File;
class SubString1 {
    String str1 = "";
    String str2 = "";
    double result;
    SubString1() {
    }
    public double plagerism(File file1, File file2) {
        try {
            Scanner scan = new Scanner(file1);
            while (scan.hasNext()) {
                str1 += scan.nextLine();
            }
            scan = new Scanner(file2);
            while (scan.hasNext()) {
                str2 += scan.nextLine();
            }
            String substr = "";
            for (int i = 0; i < str2.length(); i++) {
                for (int j = i + 1; j <= str2.length(); j++) {
                    if (str1.contains(str2.substring(i, j))) {
                        if (str2.substring(i, j).length() > substr.length()) {
                            substr = str2.substring(i, j);
                        }
                    }
                }
            }
            if (file1.getName().equals(file2.getName())) {
                result = 100;

                // System.out.print("\t\t");
            } else {
                double num = substr.length() * 2 * 100;
                double den = str1.length() + str2.length();
                result = Math.round(num / den);


            }
            System.out.format("%13.1f", result);

        } catch (Exception e) {
            System.out.println("FILE NOT FOUND");
        }
        return result;

    }

}