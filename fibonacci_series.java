package java_practice;
import java.util.Scanner;
public class fibonacci_series {
	public static void main(String ar[]) {
	Scanner in = new Scanner(System.in);
	System.out.println("enter the number");
	int num = in.nextInt();
	int start = 0;
	int sec = 1;
	int next = 0;
	System.out.printf("the fibonacci series %d times : %d\n%d\n",num,start ,sec);
	for(int i=0;i<num;i++) {
		next = start+sec;
		System.out.println(next);
		start = sec;
		sec = next;
	}
}
}
class fibo_nth_num{
	int fibo(int num){
		if(num == 0 || num == 1)return 1;
		return fibo(num-1) + fibo(num-2); 
	}
}
