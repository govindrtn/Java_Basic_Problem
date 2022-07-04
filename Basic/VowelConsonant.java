package bridgelabz.demo;
import java.util.Scanner;

public class VowelConsonant{
	
	public static void main(String[] args){
		
		System.out.println("Enter a Character :");
		Scanner scanner = new Scanner(System.in);
		   
		char character = scanner.next().charAt(0);
		
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character=='u')
		{
			System.out.println(character + " is Vowel");
		}
		else
		{
			System.out.println(character + " is Consonant");
		}
	}
}
