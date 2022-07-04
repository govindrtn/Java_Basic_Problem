package bridgelabz.functional.programs;

import java.util.Scanner;

public class Quadratic {
	
	public static void findRoot () {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a , b, c of the Quadratic Equation : ");
		
		System.out.println("Enter a : ");
		float a = scanner.nextFloat();
		
		System.out.println("Enter b : ");
		float b = scanner.nextFloat();
		
		System.out.println("Enter c : ");
		float c = scanner.nextFloat();
			
		Double delta = Math.pow(b, 2) - 4 * a * c;
		
		Double root1 = (-1 * b + Math.sqrt(delta)) / (2 * a);
		
		Double root2 = (-1 * b - Math.sqrt(delta)) / (2 * a);
	
		System.out.println("Roots of the Quadratic Equation are : " + root1 +"  "+ root2);
		
	}
	public static void main(String[] args) 
	{
		 findRoot();
	}	
}
