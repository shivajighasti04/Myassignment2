//write a program to find a palindrome number
package Assignment2;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		
	String original,reverse="";
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number to check if it is a palindrome");
	original = in.nextLine();
	int lenght = original.length();
	
	for(int i=lenght-1;i>=0;i--)
		reverse=reverse+original.charAt(i);
	if(original.equals(reverse))
		System.out.println("Enterd number is a palindrome");
	else
		System.out.println("Enterd number is not palindrome");
	
	}

}
