package com.stakeroute.exercise1;

import java.util.Scanner;

public class CheckLetter{



    public static String checkInput(char ch) {
        String res="";
        if (ch >= 65 && ch <= 90) {
            res ="Capital Letter";
        } else if (ch >= 97 && ch <= 122) {
            res="Small Letter";
        } else if (ch >= 48 && ch <= 57) {
            res ="Digit";

        } else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
            res="Special Symbols";
        }
        return  res;
    }

}
