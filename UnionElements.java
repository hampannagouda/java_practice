package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class UnionElements {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array1 size:");
		int n = in.nextInt();
		System.out.println("enter array1 elements :");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("enter the array2 size:");
		int n2 = in.nextInt();
		System.out.println("enter array2 elements :");
		int[] arr2 = new int[n2];
		for(int i=0;i<n2;i++) {
			arr2[i] = in.nextInt();
		}
		int[] t = new int[n+n2];
		System.out.println("union elements are :");
		System.arraycopy(arr, 0, t, 0, n);
		System.arraycopy(arr2, 0, t, n, n2);
		Arrays.sort(t);
		for(int i=0;i<t.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.println(t[t.length-1]);
		in.close();
	}
}
