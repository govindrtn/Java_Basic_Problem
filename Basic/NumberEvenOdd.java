package bridgelabz.demo;
import java.util.Scanner;

public class NumberEvenOdd {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to check number is EVEN or ODD");
		int number = scanner.nextInt();
		
		if (number %2 ==0)
		{
			System.out.println(number+" is EVEN");
		}
		else
		{
			System.out.println(number+" is ODD");
		}
		
	}

}
