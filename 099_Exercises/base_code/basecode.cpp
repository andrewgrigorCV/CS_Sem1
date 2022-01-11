// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	
cout << "Wadda ya wan foo? Chooz dat characta." << endl;
char ye;
cin >> ye;

for(int a = 0; a < 50; a++){
	gotoxy(50,3 + a);
	cout<< ye << endl;
	sleep(1);
	
	gotoxy(50,3 + a);

	cout<<"  ";
}
	cout<< ye <<endl;
	}
