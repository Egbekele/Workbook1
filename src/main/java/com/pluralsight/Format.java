package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String outcome = formatName("Bob", "Smith");
        System.out.print(outcome);

    }

    public static String formatName(String first, String last) {
        return last + " " + first;


    }

}

