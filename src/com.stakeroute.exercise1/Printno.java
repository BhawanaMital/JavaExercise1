package com.stakeroute.exercise1;

import java.util.Scanner;

public class Printno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=sc.nextInt();
        count_no(input);

    }

    public static  void count_no(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i +"\t");
            }
        }
    }

}
