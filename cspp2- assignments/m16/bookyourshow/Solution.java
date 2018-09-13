import java.util.Scanner;
class Patron {
	String personName;
	String mobileNumber;
	public Patron(String personName, String mobileNumber) {
		this.personName = personName;
		this.mobileNumber = mobileNumber;
	}
}
class Show {
	String movieName;
	String showDateandTime;
	String[] seats;
	public Show(String movieName, String showDateandTime, String[] seats) {
		this.movieName = movieName;
		this.showDateandTime = showDateandTime;
		this.seats = seats;
	}
}

class BookYourShow {
	public Show[] allshows;
	public int allshowscount;
	public Patron[] allPatrons;
	public int allPatronscount;

	public BookYourShow() {
		allshows = new Show[20];
		allshowscount = 0;
		allPatrons = new Patron[20];
		allPatronscount = 0;
	}
	public void addAShow(Show show) {
		allshows[allshowscount++] = show;
	}
	public Show getAShow(String movieName, String showDateandTime) {
		for (int i = 0; i < allshowscount; i++) {
			if (allshows[i].movieName.equals(movieName) && allshows[i].showDateandTime.equals(showDateandTime)) {
				return allshows[i];
			}
		}
		return null;
	}
	public void bookAShow(String movieName, String showDateandTime, Patron pa, String[] seats) {
		Show checkshow = getAShow(movieName, showDateandTime);
		if (checkshow != null) {
			int flag = 0;
			for (int i = 0; i < seats.length; i++) {
				for (int j = 0; j < checkshow.seats.length; j++) {
					if (seats[i].equals(checkshow.seats[j])) {
						checkshow.seats[j] = "N/A";
						flag = 1;
					}
				}
			}
			for (int i = 0; i < allshowscount; i++) {
				if (allshows[i].movieName.equals(checkshow.movieName) && allshows[i].showDateandTime.equals(checkshow.showDateandTime)) {
					allshows[i] = checkshow;
				}
			}
			if (flag == 1) {
				allPatrons[allPatronscount++] = pa;
			}
		}
	}

	public void printTicket(String movieName, String showDateandTime, String mobileNumber) {
		Show checkshow = getAShow(movieName, showDateandTime);
		if (checkshow != null) {
			for (int i = 0; i < allPatronscount; i++) {
				if (allPatrons[i].mobileNumber.equals(mobileNumber)) {
					System.out.println(mobileNumber + " " + movieName + " " + showDateandTime);
					break;
				}
			}
		}
    }

	public void	showAll() {
		for (int i = 0; i < allshowscount; i++) {
			String str = allshows[i].movieName + "," + allshows[i].showDateandTime + ",";
			String str1 = "[";
			for (int j = 0; j < allshows[i].seats.length; j++) {
				str1 += allshows[i].seats[j];
				if (i < allshows[i].seats.length - 1) {
					str1 += ",";
				}
			}
			str1 += "]";
			str += str1;
			System.out.println(str);
		}
	}
}

public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}