package com.stakeroute.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SortDigit {

        //Checking whether the sum of even number is greater than 15 or not
        String compare(int a,int b) {
            if (a > 15) {
                return ("True");
            } else {
                return ("False");
            }
        }

        public String sortNumber(int n) {

            char[] ch = String.valueOf(n).toCharArray();

            //Sorting the array using Array class
            Arrays.sort(ch);
            int sum = 0;

            //Checking the digit in even or not
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
            return (str +" \n" + "Sum of even numbers : " + sum + "\n" +res );

        }
    }
