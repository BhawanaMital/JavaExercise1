package com.stakeroute.exercise1;

import java.util.Scanner;

public class vowelcon {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.next();
        Vowel v = new Vowel();
        v.vowcon(input);

    }
}

    class Vowel {
        public void vowcon(String input1) {
            char c;
            for (int l = 0; l < input1.length(); l++)
            {
                c = input1.charAt(l);
                if(Character.isLetter(c))
                {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                        System.out.print("vowel \t");
                    }
                    else {
                        System.out.print("Consonant \t");
                    }
                }

                else
                    {
                        System.out.println("error");
                    }
            }

        }
    }

