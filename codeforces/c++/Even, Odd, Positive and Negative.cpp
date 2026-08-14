#include<iostream>
using namespace std;
int main(){
     int t;
     cin>>t;

       int even,odd,positive,negative;
       even=0,
       odd=0,
       positive=0,
       negative=0;

     int x;
     for(int i=0;i<t;i++){

        cin>>x;

       if(x%2==0)
         even++;

       if(x<0)
        negative++;

       if(x>0)
        positive++;

       if(x%2!=0)
        odd++;


  }


       cout<<"Even: "<<even<<endl;
       cout<<"Odd: "<<odd<<endl;
       cout<<"Positive: "<<positive<<endl;
       cout<<"Negative: "<<negative<<endl;
}

