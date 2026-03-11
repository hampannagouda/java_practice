package java_practice;
import java.util.Scanner;
public class prime_num{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the name");
		int n = in.nextInt();
		for(int i = n;i<100;i++) {
			 int num = i;
			 if(num <= 1) {
				 System.out.println("num is not prime"+num);
			 }else {
				 boolean f = true;
				 for(int j=2;j*j<=num;j++) {
					 if(num%j ==0) {
						 System.out.println("num is not prime"+num);
						 f = false;
						 break;
					 }
				 }
				 if(f) {
					 System.out.println("the num is prime"+num);
				 }
			 }
		}
	}
}
