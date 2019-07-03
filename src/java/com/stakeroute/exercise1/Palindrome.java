package com.stakeroute.exercise1;

import java.util.Scanner;

public class Palindrome {


    public static String palindromereverse(int input1) {

        int rev = 0;
        int input2=input1;
        int n;
        String output;

        //Reverse Logic

        while (input2 >0) {
            n=input2 % 10;
            rev = (rev* 10) + n;
            input2 = input2 / 10;

        }

        //Matching the input value with reverse value
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

            //Checking whether the sum is greater than 25 or not
            if(sum_even<25)
            {
                return (input1+" is a palindrome number and the sum of even number is less than 25");
            }
            else {
                return (input1+" is a palindrome number and the sum of even number is greater than 25");
            }
        }
        else {
            return (input1+" is not a palindrome number");
        }


    }
}


