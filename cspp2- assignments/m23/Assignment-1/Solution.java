import java.util.Scanner;
import java.util.TreeMap;
import java.util.Arrays;
import java.io.*;
class Solution {
	public static void main(String[] args) {
		// TreeMap<String, Integer> dict1 = new TreeMap<>();
		// TreeMap<String, Integer> dict2 = new TreeMap<>();
		try {
			Scanner s = new Scanner(System.in);
			String foldername = s.next();
			File testfile1 = new File(foldername);
			String[] files = testfile1.list();
			Arrays.sort(files);
			int[][] array = new int[files.length][files.length];
			for (int i = 0; i < files.length; i++) {
				for (int j = 0; j < files.length; j++) {
					TreeMap<String, Integer> file1 = dictionary(new Scanner(new FileReader(testfile1 + "\\" + files[i])));
					TreeMap<String, Integer> file2 = dictionary(new Scanner(new FileReader(testfile1 + "\\" + files[j])));
					array[i][j] = calculation(file1, file2);
				}
			}
			int max = 0;
			int index1 = -1;
			int index2 = -1;
			for (int i = 0;i < files.length; i++) {
				System.out.print("\t " + files[i]);
			} 
			System.out.println();
			for (int i = 0; i < files.length; i++) {
				System.out.print(files[i] + "\t");
				for (int j = 0; j < files.length; j++) {
					System.out.print(array[i][j] + "\t\t");
					if (array[i][j] < 100 && array[i][j] > max) {
						max = array[i][j];
						index1 = i;
						index2 = j;
					}
				}
			System.out.println();
			}
			System.out.println("Maximum similarity is between " );
		} catch (Exception e) {
			System.out.println("empty directory");
		}
	}
	static int calculation(TreeMap<String, Integer> dict1, TreeMap<String, Integer> dict2) {
		double num = 0.0;
		double denom1 = 0.0;
		double denom2 = 0.0;
		double result = 0.0;
		//num = dotproduct= dict1(value) * dict2(value)
		for (String key : dict1.keySet()) {
			if (dict2.containsKey(key)) {
				num += (dict1.get(key) * dict2.get(key));
			}
		}
		for (String key : dict1.keySet()) {
			int value1 = dict1.get(key);
			denom1 += Math.pow(value1, 2);
		}
		for (String key : dict2.keySet()) {
			int value2 = dict2.get(key);
			denom2 += Math.pow(value2, 2);
		}
		result = num / (Math.sqrt(denom1) * Math.sqrt(denom2));
		return (int) (result * 100);
	}
	public static TreeMap<String, Integer> dictionary(Scanner s1) {
		TreeMap<String, Integer> dict1 = new TreeMap<>();
		while (s1.hasNext()) {
			String str = s1.nextLine().replaceAll("[0-9_]", "");
			String[] doc1 = str.toLowerCase().split(" ");
			for (int i = 0; i < doc1.length; i++) {
				if (doc1[i].length() > 0) {
					if (!dict1.containsKey(doc1[i])) {
						dict1.put(doc1[i], 1);
					} else {
						dict1.put(doc1[i], dict1.get(doc1[i]) + 1);
					}
				}
			}
		}
		return dict1;
	}
}


