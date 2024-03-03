package org.example;

/*
    @author igormakovijcuk
    @project RomanToArabic
    @class Util
    @version 1.0.0
    @since 02.03.2024 - 21.02
*/

public class Main {
    public static void main(String[] args) {
        String arabic = "XX";
        Integer number = Util.toArabic(arabic);
        System.out.println(arabic + " in Arabic: " + number);
    }
}