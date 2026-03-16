package java_practice;
import java.util.Scanner;

public class IntegerToBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = in.nextInt();
		System.out.println("the binary of the number is :"+toBinary(num));
	}
	static String toBinary(int num) {
		String s = "";
		while(num != 0) {
			int rem = num%2;
			s = rem+s;
			num/=2;
		}
		return s;
	}
}
