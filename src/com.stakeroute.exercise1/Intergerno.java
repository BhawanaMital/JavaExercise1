package com.stakeroute.exercise1;

import java.util.Scanner;

public class Intergerno {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int input;
        int total=0;

        while ((input=sc.nextInt())!=0){
            total+=input;


        }
        System.out.println(total+"is the sum of the given input");
    }
}
