import java.util.Scanner;

public class InsersionSort 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n= scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element for index "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Array elements before sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//creating object for Sorting class
		Sorting sort = new Sorting();
				
		//calling selection sort of sort object
				
		//sort.insertionSort(arr);
		sort.insertionSortDec(arr);

		
		System.out.println("Array elements after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
