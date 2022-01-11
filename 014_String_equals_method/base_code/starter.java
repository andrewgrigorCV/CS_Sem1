import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please choose what character you would want to be. Wizard, Warrior, or a Rogue. Choose wisely."); 
		String word = sc.nextLine();
		
		if(word.equals("Wizard")) {
		System.out.println("You have chose Wizard.");	
		}
		else if(word.equals("Warrior")) {
		System.out.println("You have chose Warrior.");
		}
		else if(word.equals("Rogue")) {
		System.out.println("You have chose Rogue.");
		}
	}
}
