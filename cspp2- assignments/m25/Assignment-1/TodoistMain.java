/**
 * { imports Scanner class and Arrays }.
 * @author : Prasamsa
 * Date : 22-09-18
 */
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for test.
 */
class Task {
	String title;
	String assignedTo;
	int timeToComplete;
	boolean important;
	boolean urgent;
	String status;
	/**
	 * Constructs the object.
	 *
	 * @param      title           The title
	 * @param      assignedTo      The assigned to
	 * @param      timeToComplete  The time to complete
	 * @param      important       The important
	 * @param      urgent          The urgent
	 * @param      status          The status
	 * @throws     exception       The exception
	 */
	Task(final String title1, final String assignedTo1, final int timeToComplete1, final boolean important1, final boolean urgent1, final String status1) throws Exception {
		this.title = title1;
		this.assignedTo = assignedTo1;
		this.timeToComplete = timeToComplete1;
		this.important = important1;
		this.urgent = urgent1;
		this.status = status1;
	// 	if (title.equals("") || title.equals(null)) {
 //      		throw new Exception("Title not provided");
 //      	}
	// 	if (!(status.equals("done") && status.equals("todo"))) {
	// 		throw new Exception("Invalid status dud");
	// 	}
	// 	if (timeToComplete < 0) {
	// 		throw new Exception("Invalid timeToComplete" + timeToComplete);
	// }
}
	public String toString() {
		String imp = "Not Important";
		String urg = "Not Urgent";
		if (important) imp = "Important";
		if (urgent) urg = "Urgent"; 
		String str = title + ", " + assignedTo + ", " + timeToComplete + ", " + imp + ", " + urg + ", " + status;
		return str;
	}
}
/**
 * Class for todoist.
 */
class Todoist {
	//ArrayList<Task> task = new ArrayList<Task>();
	String[] task;
	/**
	 * Constructs the object.
	 */
	Todoist() {
		task = new String[10];


	}
}
	// public add(task) {

	// }
/**
 * Class for todoist main.
 */
public class TodoistMain {

	/**
	 * Starts a test.
	 */
	public static void startTest() {
		Todoist todo = new Todoist();
		Scanner s = new Scanner(System.in);
		while (s.hasNext()) {
			String[] tokens = s.nextLine().split(",");
			switch (tokens[0]) {
			case "task":
				testTask(tokens);
				break;
			// case "add-task":
			// 	testAddTask(todo, tokens);
			// 	break;
			case "print-todoist":
				System.out.println(todo);
				break;
			// case "get-next":
			// 	System.out.println(todo.getNextTask(tokens[1]));
			// 	break;
			// case "get-next-n":
			// 	int n = Integer.parseInt(tokens[2]);
			// 	Task[] tasks = todo.getNextTask(tokens[1], n);
			// 	System.out.println(Arrays.deepToString(tasks));
			// 	break;
			// case "total-time":
			// 	System.out.println(todo.totalTime4Completion());
			// 	break;
			default:
				break;
			}
		}
	}

	/**
	 * method to test add task.
	 *
	 * @param      todo    The todo
	 * @param      tokens  The tokens
	 */
	// public static void testAddTask(final Todoist todo, final String[] tokens) {
	// 	try {
	// 		todo.addTask(createTask(tokens));
	// 	} catch (Exception e) {
	// 		System.out.println(e.getMessage());
	// 	}
	// }

	/**
	 * method to test the creation of task object.
	 *
	 * @param      tokens  The tokens
	 */
	public static void testTask(final String[] tokens) {
		try {
			System.out.println(createTask(tokens));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Creates a task object.
	 *
	 * @param      tokens     The tokens
	 *
	 * @return     Task object
	 *
	 * @throws     Exception  if task inputs are invalid
	 */
	public static Task createTask(final String[] tokens) throws Exception {
		String title = tokens[1];
		String assignedTo = tokens[2];
		int timeToComplete = Integer.parseInt(tokens[3]);
		boolean important = tokens[4].equals("y");
		boolean urgent = tokens[5].equals("y");
		String status = tokens[6];
		return new Task(
				   title, assignedTo, timeToComplete, important, urgent, status);
	}

	/**
	 * main method.
	 *
	 * @param      args  The command line arguments
	 */
	public static void main(final String[] args) {
		startTest();
	}
}

