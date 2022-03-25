package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long arr[] = new Long[(256*1024)];
        int i = 0;

        while(sc.hasNextLong()) {
            arr[i] = sc.nextLong();
            i++;
        }

        double d;
        for(int j=i-1; j>=0; j--) {
            d = Math.pow(arr[j], 1.0/2.0);
            System.out.printf("%.4f\n", d);
        }
    }
}