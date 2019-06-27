package com.stakeroute.exercise1;

import java.util.Scanner;

public class ReverseNum {

    public static String  Reversenum(String n)
    {
        String output="";
        char ch[]=n.toCharArray();
        for (int i=ch.length-1;i>=0;i--)
        {
            output=output+ch[i];
        }
        return output;

    }
}
