package Arryas;

import java.util.Arrays;
import java.util.Scanner;

public class BasicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1 = new int[5];
        System.out.println("Enter 5 integers:");
        arr1[0] = sc.nextInt();
        arr1[1] = sc.nextInt();
        arr1[2] = sc.nextInt();
        arr1[3] = sc.nextInt();
        arr1[4] = sc.nextInt();
        System.out.println("Array 1: " + Arrays.toString(arr1));

        int[] arr2 = new int[5];

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Enter an integer for index : "+i+" of arr2:");
            arr2[i]=sc.nextInt();
            System.out.println("Index "+i+" Value "+arr2[i]);
            System.out.println("");
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.hashCode(arr2));
    }
}