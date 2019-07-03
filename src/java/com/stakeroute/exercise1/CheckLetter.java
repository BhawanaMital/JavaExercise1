package com.stakeroute.exercise1;

import java.util.Scanner;

public class CheckLetter{



    public static String checkInput(char ch) {
        String res="";

        //Checking whether the character is Capital Letter
        if (ch >= 65 && ch <= 90) {
            res ="Capital Letter";
        }

        // //Checking whether the character is Small Letter
        else if (ch >= 97 && ch <= 122) {
            res="Small Letter";
        }

        //Checking whether the character is Digit
        else if (ch >= 48 && ch <= 57) {
            res ="Digit";

        }

        //Checking whether the character is Special Symbol
        else if ((ch > 0 && ch <= 47) || (ch >= 58 && ch <= 64) ||
                (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 127)) {
            res="Special Symbols";
        }
        return  res;
    }

}
