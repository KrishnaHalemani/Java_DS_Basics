package Arryas;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayElementOperations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));


        System.out.println("Input the operation you want to perform on the array elements:");
        System.out.println("+ - * /  ");
        String operation = sc.nextLine();

        System.out.println("Input the index of the elements you want to access or modify:");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        System.out.println(Arrays.toString(arr));

        if(operation.equals("+")||operation.equalsIgnoreCase("Addition")||operation.equals("Add")){
            int result = arr[index1] + arr[index2];
            System.out.println(result);
        }
        else if(operation.equals("-")||operation.equalsIgnoreCase("Difference")||operation.equalsIgnoreCase("Substraction")||operation.equalsIgnoreCase("Subtract")){
            int result = arr[index1] - arr[index2];
            System.out.println(result);
        }
        else if(operation.equals("*") |operation.equalsIgnoreCase("Multiply")||operation.equalsIgnoreCase("Multiplication")){
            int result = arr[index1] * arr[index2];
            System.out.println(result);
        }
        else if(operation.equals("/")||operation.equalsIgnoreCase("Divide")||operation.equalsIgnoreCase("Division")){
            int result = arr[index1] / arr[index2];
            System.out.println(result);
        }
        else{
            System.out.println("Invalid operation");
        }

        // Accessing elements
//        System.out.println("First selected element: " + arr[index1]);
//        System.out.println("Second selected element: " + arr[index2]);
//

    }
}
