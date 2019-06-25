package com.stakeroute.exercise1;

import java.util.Scanner;

public class Setlimit {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int input = sc.nextInt();
        Setnum(input);
    }

    public static void Setnum(int n){
        if(n<1 ){
            System.out.println("Number guessed less than the original number");
        }
        else if (n>100){
            System.out.println("Number guessed more than the original number");
        }

        else {
            System.out.println(" Number guessed matches the original number");
        }
    }


}

