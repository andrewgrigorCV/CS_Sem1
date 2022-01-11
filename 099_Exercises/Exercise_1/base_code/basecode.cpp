// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;

	int x = 15;

	while(true){
		cout << x << endl;
		if(x == 5){
		break;
		}
		x = x - 1;
	}
	
	for(int i = 123; i <= 200; i = i + 2 ){
		cout << i << endl;
	}
	
	for(int b = 1253; b >= 55; b = b - 7 ){
		cout << b << endl;
	}
}
