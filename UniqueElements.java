package java_practice;

import java.util.Scanner;

public class UniqueElements {

	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array size:");
		int n = in.nextInt();
		System.out.println("enter array elements :");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("unique elements are :");
		for(int i=0;i<n;i++) {
			boolean f = true;
			for(int j=0;j<n;j++) {
				if(i != j && arr[i] == arr[j]) {
					f = false;
					break;
				}
			}
			if(f) {
				System.out.println(arr[i]+" ");
			}
		}
		in.close();
	}
}
