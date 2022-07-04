package bridgelabz.demo;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second Number");
		int num2 = scanner.nextInt();		
		
		System.out.println("Enter Third Number");
		int num3 = scanner.nextInt();
		
		if( num1 >= num2 && num1 >= num3)
		{
			System.out.println( num1 + " is Largest number");
		}
		else if (num2 >= num1 && num2 >= num3)
		{
			System.out.println(num2 + " is largest number");
		}
		else 
		{
			System.out.println(num3 + " is largest number");
		}
	}
}
