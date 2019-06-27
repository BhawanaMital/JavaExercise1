package com.stakeroute.exercise1;

import java.util.Scanner;

public class Tomjerry {



    public static String checkInt(int input) {
        int n = input % 10;

        if ((input > 20) && (input <30)) {
            if (n % 2 == 0) {
                return ("Jerry");
            } else {
                return ("Tom");
            }
        }

        else{
            return ("error");
        }

    }
}
