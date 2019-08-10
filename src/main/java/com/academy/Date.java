package com.academy;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) throws IllegalDateException {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalDateException();
        }
        if (month > 0 && month < 13) {
            this.month = month;
        } else {
            throw new IllegalDateException();
        }
        if (year > 0) {
            this.year = year;
        } else {
            throw new IllegalDateException();
        }
    }

    public static void main(String[] args) throws IllegalDateException {
        // Lesson 05 Task 01 a)
        /*new Date(17, 2, 2019);
        new Date(29, 2, 2020);
        new Date(31, 1, 1999);
        new Date(1, 1, 2012);
        new Date(13, 6, 1681);*/
//        new Date(-1, 1, 2012);
        new Date(0, 06, 1681);
    }
}
