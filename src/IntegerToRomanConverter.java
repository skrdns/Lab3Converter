/*
@autrhor Denys
@project lb333
@class IntegerToRomanConverter
@version 1.0.0
@sinc 04.04.2025 - 12 - 26
*/

public class IntegerToRomanConverter {
    private static final String[][] ROMAN_NUMERALS = {
            {"M", "1000"}, {"CM", "900"}, {"D", "500"}, {"CD", "400"},
            {"C", "100"}, {"XC", "90"}, {"L", "50"}, {"XL", "40"},
            {"X", "10"}, {"IX", "9"}, {"V", "5"}, {"IV", "4"}, {"I", "1"}
    };

    public static String intToRoman(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Число має бути більше нуля!");
        }
        StringBuilder result = new StringBuilder();

        for (String[] pair : ROMAN_NUMERALS) {
            String symbol = pair[0];
            int value = Integer.parseInt(pair[1]);

            while (num >= value) {
                result.append(symbol);
                num -= value;
            }
        }
        return result.toString();
    }
}