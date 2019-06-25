package com.stakeroute.exercise1;

import java.util.Scanner;

public class palindrome {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int input = sc.nextInt();

        palindrome(input);

    }


    public static void palindrome(int input1) {

        int rev = 0;
        int input2=input1;
        int n;


        while (input2 >0) {
            n=input2 % 10;
            rev = (rev* 10) + n;
            input2 = input2 / 10;

        }

        if (input1== rev) {
            int sum_even=0;
            int input3=input1;

            while(input3>0){

                int d=input3%10;

                if(d%2==0)
                {
                    sum_even=sum_even+d;


                }
                input3=input3/10;

            }
            System.out.println(sum_even+"is the sum");

            if(sum_even<25)
            {
                System.out.println(input1+" is a palindrome number and the sum of even number is less than 25");
            }
            else {
                System.out.println(input1+" is a palindrome number and the sum of even number is greater than 25");
            }
        }
        else {
            System.out.println(input1+" is not a palindrome number");
        }


    }
}

