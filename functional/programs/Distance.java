package bridgelabz.functional.programs;

import java.util.Scanner;

public class Distance {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x : ");
		double x = scanner.nextDouble();
		
		System.out.println("Enter y : ");
		double y = scanner.nextDouble();
		
		Distance d = new Distance();
		double distance = d.measureDistance(x , y);
		
		System.out.println("Distance of two cordinate "  + x +"  "+ y +"  "+ distance);
	}
	public double measureDistance(double x, double y) {
		
		return Math.pow(( Math.pow(x , 2) + Math.pow(y , 2) ),0.5); 
	}

}
