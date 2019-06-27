package com.stakeroute.exercise1;

import java.util.Scanner;

public class Addnum {


    public int sumOfNumbers(String st) {
        String[] str = st.split(" ");
        int sum = 0;
        try {
            for (String s : str) {
                sum += Integer.parseInt(s);
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        return sum;
    }
}
