package bridgelabz.functional.programs;

import java.util.Scanner;

public class Sum_Of_Three_integer {
	
	public static int findDistnct(int array[],int len) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		int count = 0;
		
		for ( i = 0; i < len; i++ )
		{
			for( j = i+1; j < len; j++)
			{
				for (k = j+1; k < len ; k++)
				{
					count++;
				}
			}	
		}return count;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of Array : ");
		int size = scanner.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i<arr.length; i++)
		{
			int sum = findDistnct(arr,size);
	
			System.out.println("Enter values :" +(i+1));
			System.out.println("No. of tripltes" + sum);
		}
		
	}
}
