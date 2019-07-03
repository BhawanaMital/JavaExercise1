package com.stakeroute.exercise1;

import java.util.Scanner;

public class Repeatinput1 {


        public String stringManipulate(String s, int n) {

            //printing the substring of the input string with respect to number of times the interget value
            String sub = s.substring(s.length() - n, s.length());
            for (int i = 1; i <= n; i++) {
                s += sub;
            }
            return s;
        }

    }

