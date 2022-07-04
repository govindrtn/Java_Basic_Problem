package bridgelabz.demo;

import java.util.Scanner;

public class HarmonicNumber {
	
	public static double harmonicNum(double num) {
		
		double value = 0.0;
		
			for(int i = 1; i <= num; i++ )
			{
				value = value + (1.0/i);
			}
			return value;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number ");
		double num = scanner.nextDouble();
		double result = harmonicNum(num);
		
		if(num > 0) 
		{
			System.out.println("Harmonic value of the enter number by user " + result);
		}
		else 
		{
			System.out.println("please enter a positive number");
		}
		
	}

}
