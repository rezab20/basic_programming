#include <iostream>
using namespace std;

int main() {
  int m,n;
  cin>>m>>n;
  for(int i=1; i<=m; i++){
    if (i%n) cout<<i;
    else printf("*");
    if(i<m) printf(" ");
    else printf("\n");
    
    
  
  }
  return 0;
}