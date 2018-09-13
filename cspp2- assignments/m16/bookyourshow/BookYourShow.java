/**
 * Class for patron.
 */
class Patron {
    /**
     * { declaring person name and mobile number }.
     */
    String personName;
    String mobileNumber;
    /**
     * Constructs the object.
     *
     * @param      personName    The person name
     * @param      mobileNumber  The mobile number
     */
    public Patron(String personName, String mobileNumber) {
        this.personName = personName;
        this.mobileNumber = mobileNumber;
    }
}
/**
 * Class for show.
 */
class Show {
    String movieName;
    String showDateandTime;
    String[] seats;
    /**
     * Constructs the object.
     *
     * @param      movieName        The movie name
     * @param      showDateandTime  The show dateand time
     * @param      seats            The seats
     */
    public Show(String movieName, String showDateandTime, String[] seats) {
        this.movieName = movieName;
        this.showDateandTime = showDateandTime;
        this.seats = seats;
    }
}
/**
 * Class for book your show.
 */
public class BookYourShow {
    public Show[] allshows;
    public int allshowscount;
    public Patron[] allPatrons;
    public int allPatronscount;
    /**
     * Constructs the object.
     */
    public BookYourShow() {
        allshows = new Show[20];
        allshowscount = 0;
        allPatrons = new Patron[20];
        allPatronscount = 0;
    }
    /**
     * Adds a show.
     *
     * @param      show  The show
     */
    public void addAShow(Show show) {
        allshows[allshowscount++] = show;
    }
    /**
     * Gets a show.
     *
     * @param      movieName        The movie name
     * @param      showDateandTime  The show dateand time
     *
     * @return     A show.
     */
    public Show getAShow(String movieName, String showDateandTime) {
        for (int i = 0; i < allshowscount; i++) {
            if (allshows[i].movieName.equals(movieName) && allshows[i].showDateandTime.equals(showDateandTime)) {
                return allshows[i];
            }
        }
        return null;
    }
    /**
     * { Books a show }.
     *
     * @param      movieName        The movie name
     * @param      showDateandTime  The show dateand time
     * @param      pa               { Patron details }
     * @param      seats            The seats
     */
    public void bookAShow(String movieName, String showDateandTime, Patron pa, String[] seats) {
        Show checkshow = getAShow(movieName, showDateandTime);
        if (allshowscount == 0) {
            System.out.println("No show");
        } else {
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
        } else {
            System.out.println("No show");
        }
        }
    }
    /**
     * { Prints the ticket }.
     *
     * @param      movieName        The movie name
     * @param      showDateandTime  The show dateand time
     * @param      mobileNumber     The mobile number
     */
    public void printTicket(String movieName, String showDateandTime, String mobileNumber) {
        Show checkshow = getAShow(movieName, showDateandTime);
        if (checkshow != null) {
            int flag = 0;
            for (int i = 0; i < allPatronscount; i++) {
                if (allPatrons[i].mobileNumber.equals(mobileNumber)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(mobileNumber + " " + movieName + " " + showDateandTime);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }
    }
    /**
     * Shows all.
     */
    public void showAll() {
        for (int i = 0; i < allshowscount; i++) {
            String str = allshows[i].movieName + "," + allshows[i].showDateandTime + ",";
            String str1 = "[";
            for (int j = 0; j < allshows[i].seats.length; j++) {
                str1 += allshows[i].seats[j];
                if (j < allshows[i].seats.length - 1) {
                    str1 += ",";
                }
            }
            str1 += "]";
            str += str1;
            System.out.println(str);
        }
    }
}