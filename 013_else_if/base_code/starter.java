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
		
		
		if (x > y) {
		System.out.println("Oops your number is larger than my number. Try again.");
		}
		else if(x < y)
		{
		System.out.println("Oops your number is smaller than my number! Try again");
		}
		else if(x == y)
		{
		System.out.println("YAYAYAY!! YOU GUEESED THY NUMBER IN THY CONTEST OF CHAMPIONS!!!!!!!");
		}
	}
}
