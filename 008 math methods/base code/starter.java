import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a x value.");
		int number = sc.nextInt();
		System.out.println("Pick a Y value now.");
		int number2 = sc.nextInt();
		
		System.out.println(Math.max(6,7));
		System.out.println(Math.sqrt(7));
		System.out.println(Math.pow(6,7));
	}
}
