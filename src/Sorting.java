public class Sorting 
{
	//Insertion sort algorithm for sorting in ascending order
	void insertionSort(int[] arr)
	{
		int item,j;
		for(int i=1;i<=arr.length-1;i++)
		{
			item=arr[i];
			j=i-1;
			while(j>=0 && arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
	}
	
	//Selection sort algorithm for sorting in ascending order
	void selectionSort(int[] arr)
	{
		int min,pos,help;
		for(int i=0;i<=arr.length-2;i++)
		{
			min=arr[i];
			pos=i;
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			help=arr[i];
			arr[i]=arr[pos];
			arr[pos]=help;
		}
	}
	
	//Bubble sort algorithm for sorting in ascending order
	void bubbleSort(int[] arr)
	{
		int help;
		for (int i = 0; i <= arr.length-2; i++) {
			 for (int j = 0; j <=arr.length-2-i; j++) {
				if(arr[j]>arr[j+1])
				{
					help=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= help;
				}
			
			}
		}
	}
	
	
	
	//Insertion sort algorithm for sorting in descending order
		void insertionSortDec(int[] arr)
		{
			int item,j;
			for(int i=1;i<=arr.length-1;i++)
			{
				item=arr[i];
				j=i-1;
				while(j>=0 && arr[j]<item)
				{
					arr[j+1]=arr[j];
					j--;
				}
				arr[j+1]=item;
			}
		}
		
		//Selection sort algorithm for sorting in descending order
		void selectionSortDec(int[] arr)
		{
			int max,pos,help;
			for(int i=0;i<=arr.length-2;i++)
			{
				max=arr[i];
				pos=i;
				for(int j=i+1;j<=arr.length-1;j++)
				{
					if(arr[j]>max)
					{
						max=arr[j];
						pos=j;
					}
				}
				help=arr[i];
				arr[i]=arr[pos];
				arr[pos]=help;
			}
		}
		
		//Bubble sort algorithm for sorting in descending order
		void bubbleSortDec(int[] arr)
		{
			int help;
			for (int i = 0; i <= arr.length-2; i++) {
				 for (int j = 0; j <=arr.length-2-i; j++) {
					if(arr[j]<arr[j+1])
					{
						help=arr[j];
						arr[j]= arr[j+1];
						arr[j+1]= help;
					}
				
				}
			}
		}
}
