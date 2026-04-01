package java_practice;
import java.util.Arrays;
import java.util.Scanner;

public class InterSection {
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
	Arrays.sort(arr);
	Arrays.sort(arr2);
	for(int i=0;i<n;i++) {
		for(int j=0;j<n2;j++) {
		if(arr[i] == arr[j]) {
			System.out.println(arr[i]+" ");
		}
	}}
	in.close();
}
}
