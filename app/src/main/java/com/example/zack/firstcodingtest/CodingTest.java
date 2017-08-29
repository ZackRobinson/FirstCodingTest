package com.example.zack.firstcodingtest;

import java.util.ArrayList;

/**
 * Created by Zack on 8/29/2017.
 */

public class CodingTest {
    public static void main(String[] args) {

        //problem 1
        int num = 15;
        if (num % 3 == 0) {
            System.out.println("fizz");
        } else if (num % 5 == 0) {
            System.out.println("buzz");
        } else if ((num % 3 == 0) && (num % 5 == 0)) {
            System.out.println("fizz buzz");
        }


        //problem 2
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("A");
        stringArrayList.add("B");
        stringArrayList.add("C");
        stringArrayList.add("D");
        stringArrayList.add("D");
        stringArrayList.add("E");

        String s;
        int i;
        for (i = 0; i < stringArrayList.size(); i++) {
            s = stringArrayList.get(i);
            for (int x = 0; i < stringArrayList.size(); i++)
                if (s == stringArrayList.get(i)) {
                    System.out.println(s);
                }
        }
    }
}



