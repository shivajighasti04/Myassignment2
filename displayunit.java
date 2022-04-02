//Read number and display unit
package Assignment2;
import java.util.Scanner;
public class displayunit {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System. in);
		int n,u,t,h,j;
		System.out.println("Enter a 4 digit number: ");
		n=sc.nextInt();
		
		u=n%10;
		t=n%100/10;
		h=n%1000/100;
		j=n%10000/1000;
		System.out.println("the number in the units place is "+u);
		System.out.println("the number in the tens place is "+t);
		System.out.println("the number in the hundred place is  "+h);
		System.out.println("the number in the thousand place is "+j);
		
				
				
	}

}
