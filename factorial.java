package java_practice;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = in.nextInt();
		System.out.println("the factorial of a number is :"+fact(num));
	}
	static int fact(int num) {
		if(num == 1)return 1;
		return fact(num -1)*num;
	}
		
}
