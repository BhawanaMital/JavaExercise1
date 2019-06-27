package com.stakeroute.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SortDigit {

        String compare(int a,int b) {
            if (a > 15) {
                return ("True");
            } else {
                return ("False");
            }
        }

        public String sortNumber(int n) {

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
            return (str +" \n" + "Sum of even numbers : " + sum + "\n" +res );

        }
    }
