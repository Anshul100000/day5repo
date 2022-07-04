package day5;

import java.util.Scanner;

public class leapyear {
	public  static void main(String[] args) {
		Scanner LP = new Scanner(System.in);
			System.out.println( "enter the year in 4 digit" );
				int year = LP.nextInt();
		
		if (year % 4 == 0 && year > 999 )
			System.out.println(year + "is leap year");
		else if (year % 4 !=0 && year > 999 )
			System.out.println(year + " is not leap year");
		else
			System.out.println("not exist");
		
		LP.close();
	}
}
