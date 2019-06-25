package com.stakeroute.exercise1;

import java.util.Scanner;

public class Repeatinput1 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the String");
            String str = sc.nextLine();
            System.out.println("Enter the integer");
            int i = sc.nextInt();
            StringRepeat sr = new StringRepeat();
            String result = sr.stringManipulate(str, i);
            System.out.println(result);


        }
    }

    class StringRepeat {
        public String stringManipulate(String s, int n) {
            String sub = s.substring(s.length() - n, s.length());
            for (int i = 1; i <= n; i++) {
                s += sub;
            }
            return s;
        }

    }

