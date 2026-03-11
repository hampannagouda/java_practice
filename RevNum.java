package java_practice;
import java.util.Scanner;

public class RevNum {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("enter thr number: ");
		int num = in.nextInt();
		int rev = 0;
		while(num != 0) {
			int rem = num % 10;
			rev = rev*10 + rem;
			num /= 10;
		}
		System.out.println(rev);
		
	}

}
