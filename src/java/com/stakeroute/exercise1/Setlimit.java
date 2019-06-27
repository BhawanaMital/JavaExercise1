package com.stakeroute.exercise1;

import java.util.Random;
import java.util.Scanner;

public class Setlimit {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int target = new Random().nextInt(100 - 1);
        System.out.println("Guess  a num");
        int guess = sc.nextInt();

        Setnum(target, guess);

    }

    public static String Setnum(int target, int guess) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if (guess == target) {

                return ("Number guessed matches the original number");
            } else if (guess > target) {
                guess = sc.nextInt();
                return ("Number guessed more than the original number");
            } else {
                guess = sc.nextInt();
                return (" Number guessed less than the original number");

            }
        }
    }
}



