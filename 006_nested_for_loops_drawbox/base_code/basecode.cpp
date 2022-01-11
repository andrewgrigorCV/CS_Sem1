// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"yeah we are starting c++"<<endl;

	cout<<"Please enter a symbol:";
	char x;
	cin>>x;
	
	cout<<"Please enter the height of the box you want:";
	int h;
	cin>> h;

	cout<<"Please enter the width of the box you desire:";
	int w;
	cin>> w;
	
	
	for(int a = 0; a <= h; a = a + 1){
	gotoxy(1 + 1,7);
	cout<< x << endl;

	for(int i = 0; i <= w; i = i + 1)
	gotoxy(2 + 1,8);
	cout<< x << endl;
	}
	cout << x;
}
