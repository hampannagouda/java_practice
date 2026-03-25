package java_practice;

import java.util.Scanner;
import java.util.Arrays;

public class reverseArray {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the size of array");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("enter the array elements");
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        revArray(arr);
        
        System.out.println("reversed array " + Arrays.toString(arr));
    }

    static void revArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];

            i++;   
            j--;   
        }
    }
}
