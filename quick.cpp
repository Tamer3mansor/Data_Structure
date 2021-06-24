#include <iostream>
using namespace std;
int quik(int arr[],int be,int en){
 int i=be,j=en;
int pv=i;
while(true)
{
 if(arr[pv]<=arr[j]&&pv!=j){j--;}
 else if(pv==j){break;}	
 else if(arr[pv]>arr[j])
 {
 	swap(arr[j],arr[pv]);
 	pv=j;
 }
 while(arr[pv]>=arr[i]&&pv!=i)i++;
 if(pv==i)break;
 else if(arr[pv]<arr[i])
 {
 	swap(arr[i],arr[pv]);
 	pv=i;
 }
 return pv;
 
}	
}
void sort(int arr[],int i,int d)
{
	if(i<d)
	{
		int pv=quik(arr,i,d);
		sort(arr,i,pv-1);
		sort(arr,pv+1,d);
	}
}
void print(int arr[],int n)
{
	for(int i=0;i<n;i++)
	{
		cout<<arr[i]<<endl;
	}
}
int main()
{
int arr[]={5,2,1,7};	
int n = sizeof(arr)/sizeof(arr[0]);
sort(arr,0,n);
print(arr,n);
}
