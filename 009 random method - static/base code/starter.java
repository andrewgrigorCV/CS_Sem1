import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("I love to learn coding remotely."); 
		Random rand = new Random();
		double rand_num1 = rand.nextInt(9);
		System.out.println(rand.nextInt(9));
		
		int x; 
			//1 - 100 
	x = rand.nextInt(100); //1 - 100
	System.out.println(x); 
	
	double a;
	a = 0;
	a = rand.nextDouble(); // 2.5 - 3.5
	a = a + 2.5;
	System.out.println(a);
	
		double b;
	b = 0;
	b = rand.nextDouble(); // 14.0 - 589.0
	b = b + 14.0;
	System.out.println(b);
	N
	}
}