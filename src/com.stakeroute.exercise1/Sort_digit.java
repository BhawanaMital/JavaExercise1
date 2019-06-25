package com.stakeroute.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_digit {

        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int input=sc.nextInt();
            SortNumb sn=new SortNumb();
            sn.sortNumber(input);
        }
    }

    class SortNumb {
        String compare(int a,int b) {
            if (a > 15) {
                return ("True");
            } else {
                return ("False");
            }
        }

        public void sortNumber(int n) {

            char[] ch = String.valueOf(n).toCharArray();
            Arrays.sort(ch);
            int sum = 0;
            for (char c : ch) {
                if (((int) c) % 2 == 0) {
                    sum += (int) c - (int) '0';
                }
            }
            String str = "";
            for (char c : ch) {
                str = c + str;
            }
            String res=compare(sum, 15);
            System.out.println( "Sorted number in non-increasing order : " + str + "\n" +
                    "Sum of even numbers : " + sum + "\n" +res );

        }
    }
