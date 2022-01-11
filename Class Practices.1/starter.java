import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	int x;     //Consturcting x
	int y;
	int z; 
	Random rand; //Constructing rand
	rand = new Random(); // Declare
	
	x = 5;   // Declaring x
	x = rand.nextInt(46); //0 - 45

	// 5 - 50
	x = rand.nextInt(46) + 5; //0 - 45
							  //5 - 50
	x = 5;   // Declaring x
	
	double a;
	a = 0;
	a = rand.nextDouble();  //0-1, not 1
	System.out.println(a);
							// 12.5 - 13.5
	a = a + 12.5;
	System.out.println(a);
	
	double b;
	b = 0;
	b = rand.nextDouble(); // 35.3 - 36.3
	b = b + 35.3;
	System.out.println(b);

	
	double c;
	c = 0;
	c = rand.nextDouble(); // 5 - 205
	c = c + 5;
	System.out.println(c);
	
	//5 - 205 
	x = rand.nextInt(205); //5 - 205
	System.out.println(x); 
	}
}