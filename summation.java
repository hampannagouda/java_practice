package java_practice;
import java.util.*;


public class summation {
	public static void main(String[] ar) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter the number :");
	int num = in.nextInt();
	int num2 = num;
	while(num/10 != 0) {
		num = NumSumm(num);
		num2 = SqurSum(num2);
		
	}
	System.out.println("the sum of number"+num);
	System.out.println("the sum of Square of number"+num2);
		
}


static int NumSumm(int n) {
	int sum = 0;
	while(n != 0) {
		sum += n%10;
		n /=10;
	}
	return sum;
}
static int SqurSum(int n) {
	int sum = 0;
	while(n != 0) {
		int rem = n %10;
		sum += (rem*rem);
		n /=10;
	}
	return sum;
}
}