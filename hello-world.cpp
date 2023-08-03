#include <iostream>
using namespace std;

int main() {
  int a;
  cin>>a;
  int b = 0;
  for(int i = 0;i<=a;i++){
  	for(int j = 0;j<i;j++){
    	printf("%d", b);
        b++;
        if(b==10){
        	b=0;
        
        }
    
    }
    cout<<endl;
  
  }
  
  return 0;
}