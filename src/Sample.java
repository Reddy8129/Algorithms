import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		System.out.println("Java program to reverse a num");
		Scanner scan = new Scanner(System.in);
		ReverseNum n= new ReverseNum();
		System.out.println("Enter a number");
		int num= scan.nextInt();
		int rev=n.revNum(num);
		System.out.println("Reversed number is "+rev);
	}
}
