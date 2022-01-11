import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely.");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String text = sc.nextLine();
		
		System.out.println("How old are you?");
		int number = sc.nextInt();

		System.out.println("What month is your birthday?");
		int number2 = sc.nextInt();

		System.out.println("What day is your birthday?");
		int number3 = sc.nextInt();

		System.out.println("What year is your birthday?");
		int number4 = sc.nextInt();

		System.out.println("How much is a buck fifty?");
		int number5 = sc.nextInt();

	}
}
