package java_practice;
import java.util.*;

public class perfect_number {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the number :");
		int num = in.nextInt();
		if(factSum(num) == num) {
			System.out.println("the number is perfect number");
		}else {
			System.out.println("the number is not perfect number");
		}
		in.close();
		
	}
	static int factSum(int num) {
		int sum = 0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		return sum;
	}
}

