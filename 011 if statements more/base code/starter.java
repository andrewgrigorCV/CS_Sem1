import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give me a number.");
		int x = sc.nextInt();
		
		System.out.println("Give me a number again.");
		int y = sc.nextInt();
		
		if (x == y)
		{
		System.out.println("They are equal");
		}
		else if (x != y)
		{
		System.out.println("They are not equal.");
		}
	}
}
