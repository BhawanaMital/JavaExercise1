package com.stakeroute.exercise1;

import java.util.Scanner;

public class VowelConsonant {

        public String VowCon(String input1) {
            char c;
            String output=" ";
            for (int l = 0; l < input1.length(); l++)
            {
                c = input1.charAt(l);
                if(Character.isLetter(c))
                {

                    //Checking wheher the string consists of vowel or not
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        output=output+"Vowel"+" ";
                    }
                    else {
                        output=output+"Consonant"+" ";
                    }
                }

                else
                    {
                        output="error";
                    }
            }return output;
        }
    }

