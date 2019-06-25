package com.stakeroute.exercise1;

import java.util.Scanner;

public class Addnum {

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number");
        int number=0;
        int sum=0;

        while((number=sc.nextInt())!=0){
            sum+=number;
        }
        System.out.println(sum);
    }
}
