package java_practice;

import java.util.Scanner;

class linearSearch {

	int LinearSearch(int[] arr,int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
}
class demo extends linearSearch{
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the size of the array :");
		int n = in.nextInt();
		System.out.println("enter the array elements :");
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("enter the target element :");
		int num = in.nextInt();
		demo d1 = new demo();
		int target = d1.LinearSearch(arr, num);
		if(target < 0 )System.out.println("element not found");
		else
			System.out.println("element found at index of "+target);
	}
}
