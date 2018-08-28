import java.util.Scanner;
class factorial
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(factorial(num));
	}
	static int factorial(int num)
	{
		if(num == 1)
		{
			return 1;
		}
		else
		{
			return num * factorial(num-1);
		}
	}
}