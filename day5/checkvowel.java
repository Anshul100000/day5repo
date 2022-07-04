package day5;

import java.util.Scanner;

public class checkvowel {

	
		public static void main(String[] args) {
			Scanner CW = new Scanner(System.in);
				System.out.println("enter the alphabet = ");
					char ch = CW.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(ch + " is vowel");
		else
			System.out.println(ch + " is not vowel");
		
		CW.close();
	
	}
}
