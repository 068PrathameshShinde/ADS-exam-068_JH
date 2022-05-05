//Q1)  sorting

class Sorting
{
	void insertionSort(int arr[])
	{
		int n=arr.length;
		
		for(int i=n-1;i>=0;i--)
		{
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>=arr[key])
			{
				arr[j+1]=arr[j];
				j--;
			
			}
			int t=arr[j+1];
			arr[j+1]=key;
			key=t;
		}
		
	}
	void display(int arr[])
	{
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	
	}
	public static void main(String args[])
	{
		Sorting s=new Sorting();
		
	int a1[] = {1,2,4,5,3};
		
		System.out.println("before sorting");
		s.display(a1);
		System.out.println();
		s.insertionSort(a1);
		System.out.println("after sorting");
		s.display(a1);
	
	}


}