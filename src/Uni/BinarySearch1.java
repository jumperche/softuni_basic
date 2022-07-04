package Uni;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch1 {
    public static void main( String[] args) {
        double array[] = { 55.4, 44.3, 65.444, 85, 45, 42, 76, 400.4, 993.33, 3883.843 };
        Scanner scanner = new Scanner(System.in);
        java.lang.String input = "";
        System.out.println("Enter value to search:");
        input = scanner.nextLine();
        Arrays.sort(array);
        int result = Arrays.binarySearch(array, 4, array.length, Double.parseDouble(input));

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        if (result >= 0) {
            System.out.println(result + " " + array[result]);
        }
        else
            System.out.println("Value not found.");
    }
}
