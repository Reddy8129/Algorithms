import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n= scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the "+ i +" element");
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter key to search");
		int key = scan.nextInt();
		
		int low =0;
		int high=arr.length-1;
		
		
		int result = binarySearch(arr,key,low, high);
		if(result<0){
			System.out.println("Key not found");
		}
		else
			System.out.println("Key found at index "+ result);
	}

	 static int binarySearch(int[] arr, int key, int low, int high) 
	 {
		 if(high>=low)
		 {
			 int mid = (low+high)/2;
			 if(arr[mid]==key)
				 return mid;
			 if(key<arr[mid])
				 return binarySearch(arr,key,low,mid-1);
			return binarySearch(arr,key,mid+1,high);
		 }
		return -1;
	 }
}

