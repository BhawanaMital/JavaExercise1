package com.stakeroute.exercise1;

import java.util.Scanner;

public class Printno {

    public static  String  Count_no(int n){
        String output="";
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                output=output+i +" ";
            }

        }
        return output;
    }

}
