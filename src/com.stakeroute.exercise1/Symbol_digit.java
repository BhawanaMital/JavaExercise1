package com.stakeroute.exercise1;

import java.util.Scanner;

public class Symbol_digit {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        char input = sc.next().charAt(0);
        Check_input(input);
    }

    public static void Check_input(char ch){
        if (ch>=65 && ch<=90)
        {
            System.out.println("Capital Letter");
        }
        else if (ch>=97 && ch<=122)
        {
            System.out.println("Small Letter");
        }
        else if (ch>=48 && ch<=57){
            System.out.println("Digit");

        }
        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)||
                (ch>=91 && ch<=96)||(ch>=123 && ch<=127)){
            System.out.println("Special Symbols");
        }
    }
}
