package java_practice;
import java.util.Scanner;

public class strong_number {


		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("enter the number :");
			int num = in.nextInt();
			int copy = num;
			int sum = 0;
			while(num != 0 ) {
				int rem = num%10;
				sum += fact(rem);
				num /=10;
			}
			if(sum == copy) {
				System.out.println("the given number is perfect number :"+copy);
			}else {
				System.out.println("the given number is not perfect number :"+copy);
			}
		}
		
		
		static int fact(int num) {
			if(num == 1)return 1;
			return fact(num -1)*num;
		}
}
