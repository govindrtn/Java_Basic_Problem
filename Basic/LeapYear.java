package bridgelabz.demo;
import java.util.Scanner;


public class LeapYear {
	
	public static boolean leapYearcheck(int year){
		
		if(year > 1000) 
		{
			if((year % 400 ==0) || (year % 4 == 0) && (year % 100 != 0)) 
			{
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter year in YYYY ");
		int year = scanner.nextInt();
		boolean result = leapYearcheck(year);
		
		if(result) 
		{
			System.out.println("Year is a leap year " + year);
		}
		else 
		{
			System.out.println("Year is not a leap year " + year);
		}
		
		
	}

}
