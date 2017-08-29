package com.example.zack.firstcodingtest;

import java.util.ArrayList;

/**
 * Created by Zack on 8/29/2017.
 */

public class CodingTest {
    public static void main(String[] args) {

        //problem 1
        for (int num = 0; num <= 20; num++) {
            System.out.println(num);
            if ((num % 3 == 0) && (num % 5 == 0)) {
                System.out.println("fizz buzz");
            } else if (num % 5 == 0) {
                System.out.println("buzz");
            } else if (num % 3 == 0) {
                System.out.println("fizz");
            }
        }

        //problem 2
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("D");
        stringArrayList.add("E");
        stringArrayList.add("B");

        String s;
        int dup = 0;
        int i;
        for (i = 0; i < stringArrayList.size(); i++) {
            s = stringArrayList.get(i);
            for (int x = 0; x < stringArrayList.size(); x++)
                if (s == stringArrayList.get(x)) {
                    dup++;
                    if (dup > 1) {
                        System.out.println(s);
                    }
                }
            dup = 0;

        }
    }
}



