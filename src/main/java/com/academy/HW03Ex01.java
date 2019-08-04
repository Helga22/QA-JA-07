package com.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HW03Ex01 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();
        System.out.println("You entered String: " + s);
        int ct = 0;
        ArrayList<String> arr = new ArrayList<String>();
        for (String str : s.split(" ")) {
            if (str.charAt(0) == 'd') {
                ct++;
                arr.add(str);
            }
        }
        String[] simpleArray = new String[arr.size()];
        arr.toArray(simpleArray);
        System.out.println(Arrays.toString(simpleArray));
        System.out.println("total  number of words starting with letter 'd' :" + ct);
    }
}