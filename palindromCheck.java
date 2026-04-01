package java_practice;

import java.util.Scanner;

public class palindromCheck {
	public static void main(String []a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array size");
		int n = in.nextInt();
		int []arr = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		int i=0;int j=arr.length-1;
		while(i<j) {
			if(arr[i++] != arr[j--]) {
				System.out.println("not a palindrome");
				return;
			}
		}
		System.out.println("is a palindrome");
		in.close();
	}
}
