package day5;

import java.util.Scanner;

public class evenodd {
		
	public static void main(String[] args) {
		Scanner HM = new Scanner(System.in);
			System.out.println("enter the no. ");
		int num = HM.nextInt();
		
	if (num%2==0)
		System.out.println(num+"is even no." );
	else
		System.out.println("is odd no.");
	
	HM.close();
	}
}
