package bridgelabz.demo;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Dividend Number");
		int firstNum = scanner.nextInt();
		
		System.out.println("Enter Divisor Number");
		int secondNum = scanner.nextInt();
		
		System.out.println("Before swap firstnumber is " + firstNum + " and " + "second number is " + secondNum);
		
		int temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		
		System.out.println("After swap firstnumber is " + firstNum + " and " + "second number is " + secondNum);
		
	}
}
