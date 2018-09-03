import java.util.Scanner;
class InputValidator
{
	String input;
	public InputValidator(String input) {
        this.input = input;
	}
	boolean validateData() {
		final int n = 6;
		if (input.length() >= n) {
			return true;
		}
		return false;
	}
}
public class Solution
{
	private Solution() {

	}
	public static void main(String args[])
    {
    	Scanner s = new Scanner(System.in);
    	String input = s.next();
    	InputValidator i = new InputValidator(input);    	
    	System.out.println(i.validateData());

    }

}
