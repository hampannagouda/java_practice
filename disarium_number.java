package java_practice;
import java.util.*;

public class disarium_number {
	
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			System.out.println("enter the number :");
			int num = in.nextInt();
			int count = count(num);
			int sum = sum(num,count);
			if(sum == num) {
				System.out.println("the number is disarium number");
			}else {
				System.out.println("the number is not disarium number");
			}
			in.close();
		}
		static int count(int num) {
			int count = 0;
			while(num != 0) {
				count++;
				num/=10;
			}
			return count;
		}
		static int sum(int num,int count) {
			int sum = 0;
			while(num != 0) {
				int rem = num %10;
				sum += Math.pow(rem, count);
				num /=10;
				count--;
			}
			return sum;
		}
	


}
