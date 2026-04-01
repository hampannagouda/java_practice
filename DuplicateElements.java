package java_practice;

import java.util.Scanner;

public class DuplicateElements {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array size:");
		int n = in.nextInt();
		System.out.println("enter array elements :");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("duplicate elements are :");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]+" ");
					break;
				}
			}
		}
		in.close();
	}
}
