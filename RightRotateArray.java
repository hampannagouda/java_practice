package java_practice;
import java.util.Arrays;
import java.util.Scanner;


public class RightRotateArray {


		public static void main(String []a) {
			Scanner in = new Scanner(System.in);
			System.out.println("enter the size of an array");
			int n = in.nextInt();
			System.out.println("enter the array elements");
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = in.nextInt();
			}
			System.out.println("enter the rotate number");
			int k = in.nextInt();
			k = k%arr.length;
			for(int i=0;i<k;i++) {
				int last = arr[arr.length-1];
				for (int j = arr.length-1; j > 0 ; j--) {
					arr[j] = arr[j-1];				
				}
				arr[0] = last;
			}
			System.out.println(Arrays.toString(arr));
		}

}
