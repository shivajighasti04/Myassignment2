//write a program to check vowel or consonant
package Assignment2;
import java.util.Scanner;
public class vowelconsonant {
	public static void main(String[] args) {
	 boolean isVowel = false;
	 Scanner input = new Scanner (System.in);
	 System.out.println("Enter a character : ");
	 char ch = input.next().charAt(0);
	 switch (ch){
	 case 'a':
	 case 'e':
	 case 'i':
	 case 'o':
	 case 'u':
	 case 'A':
	 case 'E':
	 case 'I':
	 case 'O':
	 case 'U': isVowel = true;	
	 }
	 if (isVowel == true) {
		 System.out.println(ch+" is a Vowel");
		 
	 }
	 else {
		 if ((ch >= 'a' && ch<='z') || (ch>='A' && ch<='Z'))
			 System.out.println(ch+" is a consonant");
		 else
			 System.out.println("Input is an alphabet");
	 }
		 	 
	}

}
