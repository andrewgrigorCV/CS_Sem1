// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;
	
	cout<<"Enta yo first nomba"<<endl;
	int x = 0;
	cin>> x;
	
	cout<<"Enta yo second nomba"<<endl;
	int y = 0;
	cin>> y;
	
	cout<<"What operation do you want to do? ( m, q, s, a.)"<<endl;
	char t = 0;
	cin>> t;
	
	char m = 'm';
	char q =  'q';
	char s  = 's';
	char a = 'a';
	
	if(t == m) {
	int p = x * y;
	cout<< "The product of these two numbers is:  ";
	cout<< p <<endl;
	}
	if(t == q) {
	int r = x / y;
	cout<< "The quotient of these two numbers is:  ";
	cout<< r <<endl;
	}
	if(t == s) {
	int w = x + y;
	cout<< "The sum of these two numbers is:  ";
	cout<< w <<endl;
	}
	if(t == a) {
	int g = x - y;
	cout<< "The difference of these two numbers is:  ";
	cout<< g <<endl;
	}
}
