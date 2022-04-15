import java.util.*;

public class LinearSearch {
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
		
		int result = linearSearch(arr,key);
		if(result<0){
			System.out.println("Key not found");
		}
		else
			System.out.println("Key found at index "+ result);
	}
	static int linearSearch(int[] arr, int key)
	{
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}
}
