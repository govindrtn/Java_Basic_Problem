package bridgelabz.demo;

import java.util.Scanner;

public class Factors{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int Number = scanner.nextInt();
		
		for(int i = 1; i <=Number; i++) 
		{
			if(Number % i ==0)
			{
				System.out.println("Factor of "+Number+ " is " +i);
			}
			
		}
	}
	

}
