package SoftuniFundamentals;

import java.util.*;

public class EnglishNameOfTheLastDigit {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner ( System.in );
        int n = Integer.parseInt ( scanner.nextLine ( ) );
        digit ( n );
    }
    public static void digit(int n){
        int x=n%10;
        switch (x){
            case 1:
                System.out.println ("one" );
                break;
            case 2:
                System.out.println ("two" );
                break;
            case 3:
                System.out.println ("three" );
                break;
            case 4:
                System.out.println ("four" );
                break;
            case 5:
                System.out.println ("five" );
                break;
            case 6:
                System.out.println ("six" );
                break;
            case 7:
                System.out.println ("seven" );
                break;
            case 8:
                System.out.println ("eight" );
                break;
            case 9:
                System.out.println ("nine" );
                break;
            case 0:
                System.out.println ("zero" );
                break;
            default:
                System.out.println ("error" );
                break;
        }
    }
}