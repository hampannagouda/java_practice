package java_practice;

import java.util.Scanner;
import java.util.Arrays;

public class MoveZeroLast {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("using temp array"+Arrays.toString(tempArray(arr,n)));
		in.close();
	}
	static int[] tempArray(int[] arr,int n) {
		int j=0;
		int[] temp = new int[n];
		for(int i=0;i<n;i++) {
			if(arr[i] != 0) {
				temp[j++] = arr[i];
			}
		}
		return temp;
	}
}
