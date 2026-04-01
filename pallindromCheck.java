package java_practice;
import java.util.Scanner;

public class pallindromCheck {
		public static void main(String args[]) {
			Scanner in = new Scanner(System.in);
			System.out.print("enter thr number: ");
			int num = in.nextInt();
			in.close();
			int copy = num;
			int rev = 0;
			while(num != 0) {
				int rem = num % 10;
				rev = rev*10 + rem;
				num /= 10;
			}
			if(copy == rev)
				System.out.println("the number is pallindrom");
			else
				System.out.println("the number not is pallindrom");
			
		}
		

	}

