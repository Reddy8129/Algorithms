import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		System.out.println("Java Program to swap two numbers without using help variable");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first num");
		int a=scan.nextInt();
		System.out.println("enter the second num");	
		int b= scan.nextInt();
		
		System.out.println("Before swap a= "+a+":: b= "+ b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After swap a= "+a+":: b= "+ b);
	}
}
