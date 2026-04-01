package java_practice;
import java.util.*;

public class HappyNumber {
	{
	System.out.print("hello from non static block");
	}

	public static void main(String[] ar) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = in.nextInt();
		while(num > 9) {
			num = summation(num);
		}
		if(num == 1 || num == 7) {
			System.out.println("the entered number is happy number");
		}else {
			System.out.println("the entered number is not happy number");
		}
		in.close();
	}
	static int summation(int num) {
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum += (rem * rem);
			num /=10;
		}
		return sum;
	}
}
