package java_practice;

import java.util.Scanner;

public class XylemPhloem {

	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number");
		int num = in.nextInt();
		int copy = num;
		int last = copy%10;
		copy /= 10;
		int meanSum = 0;
		while(copy >= 10) {
			meanSum += copy%10;
			copy /= 10;
		}
		int exSum = last + copy ;
		if(exSum == meanSum) {
			System.out.println("the number is xylem");
		}else {
			System.out.println("the number is pholem");
		}		
	}
}
