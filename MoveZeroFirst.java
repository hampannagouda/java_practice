package java_practice;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroFirst {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("using temp array"+Arrays.toString(withOutSort(arr,n)));
		Arrays.sort(arr);
		System.out.println("array"+Arrays.toString((arr)));
		in.close();
	}
	static int[] withOutSort(int[]arr,int n) {
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i] == 0) {
				i++;
			}else if(arr[j] != 0) {
				j--;
			}else {
				arr[i] = arr[i] + arr[j];
				arr[j] = arr[i] - arr[j];
				arr[i] = arr[i] - arr[j];
			}
		}
		return arr;
	}
}