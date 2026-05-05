package Arryas;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementOperations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        String operation = sc.nextLine();
        System.out.println("Input the operation you want to perform on the array elements:");
        if(operation=="+"||operation=="Sum"||operation=="Addition"||operation=="Add"){

        }
        System.out.println("Input the index of the elements you want to access or modify:");
        // Accessing elements
        System.out.println("First element: " + arr[0]);
        System.out.println("Third element: " + arr[2]);

        // Modifying elements
        arr[1] = 10; // Change the second element to 10
        System.out.println("Modified array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
