package com.academy;

import java.util.Arrays;

public class Sample03 {
    public static void main(String[] args) {
        String[] tracks = {"track_01", "track_03", "track_21", "track_15", "track_12", "track_99", "track_11", "track_10"};
        for (int i = 0; i < tracks.length; i++) {
            System.out.println(tracks[i]);

        }

        System.out.println("Method 2");
        for (String element : tracks) {
            System.out.println(element);
        }

//        int[] numbers = {1, 4, 6}

        Arrays.sort(tracks);
        System.out.println(Arrays.toString(tracks));

        // "filter tracks from 10 to 15" >>> output array as string > trim from string 2 last chars > if ends with 10 to 15 >
    }
}