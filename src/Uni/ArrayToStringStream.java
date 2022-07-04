package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayToStringStream {
    public static void main( String[] args)
    {
        Scanner scan = new Scanner (System.in);
        // Asking the user for array size
        System.out.println("Enter the array size : ");
        int size = scan.nextInt();
        // Creating the array
        java.lang.String arr[] = new java.lang.String[size];
        System.out.println("Enter the array elements : ");
        // Takes the string as input from the user
        for(int i = 0;i<size;i++)
        {
            arr[i] = scan.next();
        }
        System.out.println("The array elements are : ");
        // Array elements printed using Stream API
        Arrays.stream(arr).forEach(System.out::println);
    }
}
