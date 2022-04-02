//write a program for the sum of n natural number
package Assignment2;
import java.util.Scanner;
public class sumnatural2 {
	
	public static void main(String[] args) {
		
		int x, i = 1;
		int sum = 0;
		System.out.println("Enter Number of items :");
		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		
		while(i <= x)
		{
			sum = sum +i;
			i++;
		}
		System.out.println("Sum of "+x+" number is :"+sum);
	}

}
