package com.stakeroute.exercise1;

import java.util.Scanner;

public class Tomjerry {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a interger");
        int input = sc.nextInt();
        checkint(input);

    }

    public static void checkint(int input) {
        int n = input % 10;

        if ((input > 20) && (input <30)) {
            if (n % 2 == 0) {
                System.out.println("Jerry");
            } else {
                System.out.println("Tom");
            }
        }

        else{
            System.out.println("error");
        }

    }
}
