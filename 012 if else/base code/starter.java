import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Try to guess my number that is between 1-100.");
		int x = sc.nextInt();
		
		int y;
		y = 55;
		
		
		if (x == y) 
		{
		System.out.println("Great job!!! You guessed my number!!!");
		}
		else if(x != y)
		{
		System.out.println("That is not my number!! Try Again!!");
		}
	}
}
