//Write a reverse number programe using for loop
package Assignment2;
import java.util.Scanner;
public class reverseforloop {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		int sum = 0;
		for(int num = obj.nextInt(); num > 0 ; num = num / 10 )
		{
			int r = num % 10;
			sum = sum * 10 + r;
		}
		System.out.println(sum);
	}

}
