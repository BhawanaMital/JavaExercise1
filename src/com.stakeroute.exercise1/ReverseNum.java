package com.stakeroute.exercise1;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.next();
        Reversenum(input);
    }

    public static void Reversenum(String n)
    {
        char ch[]=n.toCharArray();
        for (int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }

    }
}
