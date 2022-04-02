//write a reverse number program using while loop
package Assignment2;
import java.util.Scanner;
public class reversewhileloop {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = obj.nextInt();
		int sum = 0;
		
		while(num > 0)
		{
			int r = num %10;
			sum = sum * 10 + r;
			num = num/10;
		}
		System.out.println(sum);
	}

}
