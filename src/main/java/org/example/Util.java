package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Util {

    private static final Pattern romanPattern = Pattern.compile("^(?=[MDCLXVI])M{0,3}(C[MD]|D?C{0,4})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    private static final Map<String, Integer> romanToArabic = new HashMap<String, Integer>() {{
        put("I", 1);
        put("IV", 4);
        put("V", 5);
        put("IX", 9);
        put("X", 10);
        put("XL", 40);
        put("L", 50);
        put("XC", 90);
        put("C", 100);
        put("CD", 400);
        put("D", 500);
        put("CM", 900);
        put("M", 1000);
    }};

    public static Integer toArabic(String romanNumber) {
        if (!matchesRomanPattern(romanNumber)) {
            return null;
        }

        int result = 0;
        int previousValue = 0;

        for (int i = 0; i < romanNumber.length(); i++) {
            char c = romanNumber.charAt(i);
            int currentValue = romanToArabic.get(String.valueOf(c));
            if (i > 0 && currentValue > previousValue) {
                result += currentValue - (2 * previousValue);
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }

        if (result > 4000) throw new IllegalArgumentException("Roman numeral exceeds 4000");

        return result;
    }

    public static boolean matchesRomanPattern(String romanNumber) {
        return romanPattern.matcher(romanNumber).matches();
    }
}
