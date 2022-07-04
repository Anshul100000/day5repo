package day5;

import java.util.Scanner;

public class checkpoweroftwo {
	
	public static void main(String[] args) {
		Scanner PT = new Scanner(System.in);
			System.out.println("enter the no.");
			int num1 = PT.nextInt();
			int num = 2;
			double checkpoweroftwo = Math.pow(num1, num);
				System.out.println("power of 2^ " + num1+ "="+ checkpoweroftwo);
			
			PT.close();	
	}

}
