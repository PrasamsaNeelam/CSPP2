import java.util.*;
import java.io.*;

class Solution {
	static TreeMap<String, ArrayList<String>> dict = new TreeMap<>();
	public static void main(String[] args) {
		try {
			File inputfile = new File("Testcases_SocialNetwork\\input001.txt");
			Scanner s = new Scanner(inputfile);
			while (s.hasNext()) {
				String lines = s.nextLine();
				String[] tokens = lines.split(" ");
				switch (tokens[0]) {
				case "Create":
					int a = Integer.parseInt(tokens[1]);
					while (a > 0) {
						String line = s.nextLine();
						line = line.replace(".", "");
						String[] token = line.split(" is connected to ");
						String[] network = token[1].split(", ");
						ArrayList<String> net = new ArrayList<String>(Arrays.asList(network));
						dict.put(token[0], net);
						a--;
					}
					break;
				case "Network":
					System.out.println(dict);
					break;
				case "getConnections":
					if (dict.containsKey(tokens[1])) {
						ArrayList<String> str = dict.get(tokens[1]);
						System.out.println(str);
					} else {
						System.out.println("Not a user in network");
					}
					break;
				case "addConnections":
					if (dict.containsKey(tokens[2])) {
						if (dict.containsKey(tokens[1])) {
							dict.get(tokens[1]).add(tokens[2]);
						}
					} else {
						System.out.println("Not a user in network");
					}
					break;
				case "CommonConnections":
					ArrayList<String> connections = new ArrayList<String>();
					ArrayList<String> values1 = dict.get(tokens[1]);
					ArrayList<String> values2 = dict.get(tokens[2]);
					for (String each : values1) {
						for (String other : values2) {
							if (each.equals(other)) {
								connections.add(each);
							}
						}
					}
					System.out.println(connections);
					break;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}

// class User {
// 	String name;
// 	String[] friendsList;
// 	User(String name1, String[] friends) {
// 		this.name = name1;
// 		this.friendsList = friends;
// 	}
// }

// class SocialNetwork {
// 	private
// }

// public class Solution {
// 	Solution() {
// 	}
// 	public static void main(String[] args) {
// 		//Scanner s = new Scanner(System.in);
// 		FileReader file = new FileReader("SocialNetwork.txt");
// 		String i = "";
// 		while ((i = file.read()) != null) {
// 		}
// 	}
// }