import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Java program to sort the numbers using Bubble sort");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n= scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+ i +" element");
			arr[i]=scan.nextInt();
		}
		System.out.println("###########################################");
		System.out.println("Elements before Swap");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//creating object for Sorting class
		Sorting sort = new Sorting();
		
		//calling bubble sort of sort object
		
		//sort.bubbleSort(arr);
		sort.bubbleSortDec(arr);
		
		System.out.println("###########################################");
		System.out.println("Elements after Swap");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
