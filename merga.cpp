#include<bits/stdc++.h>
using namespace std;
void merga(int arr[],int l,int m,int r)
{
 int n1=m-l+1;
 int n2=r-m;
 int arr1[n1];
 int arr2[n2];
 for(int i=0;i<n1;i++)
 	arr1[i]=arr[i+l];
 for(int j=0;j<n2;j++)
 	arr2[j]=arr[m+j+1];
 	int j=0,k=l,i=0;
 	while(i<n1&&j<n2)
 	{
 		if(arr1[i]<=arr2[j])
 		{
 			arr[k]=arr1[i];
 			i++;
		}
 		if(arr1[i]>=arr2[j])
 		{
 			arr[k]=arr2[j];
 			j++;
		}
		k++;
	}
	while(i<n1)
	{
		arr[k]=arr1[i];
		i++;k++;
	}
		while(j<n2)
	{
		arr[k]=arr1[j];
		j++;k++;
	}
 	 	
}
void sort(int arr[],int l,int r)
{
	if(l>=r){
	return;}
	int m=l+(r-l)/2;
	sort(arr,l,m);
	sort(arr,m+1,r);
	merga( arr,l,m,r);
}
void print(int A[], int size)
{
    for (int i = 0; i < size; i++)
        cout << A[i] << " ";
}
int main()
{
	 int arr[] = { 12, 11, 13, 5, 6, 7 };
    int arr_size = sizeof(arr) / sizeof(arr[0]);

 cout << "Given array is \n";
    print(arr, arr_size);
 
    sort(arr, 0, arr_size - 1);
 
    cout << "\nSorted array is \n";
    print(arr, arr_size);
    return 0;

}
