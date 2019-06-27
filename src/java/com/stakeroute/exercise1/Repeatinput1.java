package com.stakeroute.exercise1;

import java.util.Scanner;

public class Repeatinput1 {


        public String stringManipulate(String s, int n) {
            String sub = s.substring(s.length() - n, s.length());
            for (int i = 1; i <= n; i++) {
                s += sub;
            }
            return s;
        }

    }

