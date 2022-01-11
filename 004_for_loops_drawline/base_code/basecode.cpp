// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter a symbol"<<endl;
	char x;
	cin>>x;
	cout<<"Please enter the length you desire."<<endl;
	int k;
	cin>>k;
	cout<<"Do you want horizontal (h) or vertical (v) ?????"<<endl;
	char y;
	cin>>y;

	for(int a = 0; a <= k; a = a + 1)
	cout<< x << endl;
	
	if(y == 'h'){
	for(int a = 0; a <= k; a = a + 1)
	cout<<x;
	}
	if(y == 'v'){
	cout<<x <<endl;
	}
}
