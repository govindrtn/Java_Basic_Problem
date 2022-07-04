package bridgelabz.demo;

import java.util.Scanner;

public class Power_Of_2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int number = scanner.nextInt();
		
		System.out.println("User enter " +number+ "" +(Math.pow(2, number)) );
		
		System.out.println("Printing all till power value " + number);
		
		for (int i=1; i<=number; i++) 
		{
			System.out.println("power of 2 " +i+" is " +Math.pow(2, i));
		}
	}

}
