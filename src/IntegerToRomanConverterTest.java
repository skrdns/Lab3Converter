/*
@autrhor Denys
@project lb333
@class IntegerToRomanConverterTest
@version 1.0.0
@sinc 04.04.2025 - 12 - 30
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntegerToRomanConverterTest {
    //1
    @Test
    void shouldConvertOneToRoman() {
        assertEquals("I", IntegerToRomanConverter.intToRoman(1));
    }

    //2
    @Test
    void shouldConvertFiveToRoman() {
        assertEquals("IV", IntegerToRomanConverter.intToRoman(4));
    }

    //3
    @Test
    void shouldConvertTenToRoman() {
        assertEquals("X", IntegerToRomanConverter.intToRoman(10));
    }

    //4
    @Test
    void shouldConvertFiftyToRoman() {
        assertEquals("L", IntegerToRomanConverter.intToRoman(50));
    }

    //5
    @Test
    void shouldConvertHundredToRoman() {
        assertEquals("C", IntegerToRomanConverter.intToRoman(100));
    }

    //6
    @Test
    void shouldConvertFiveHundredToRoman() {
        assertEquals("D", IntegerToRomanConverter.intToRoman(500));
    }

    //7
    @Test
    void shouldConvertThousandToRoman() {
        assertEquals("M", IntegerToRomanConverter.intToRoman(1000));
    }

    //8
    @Test
    void shouldConvertFourToRoman() {
        assertEquals("V", IntegerToRomanConverter.intToRoman(5));
    }

    //9
    @Test
    void shouldConvertNineToRoman() {
        assertEquals("IX", IntegerToRomanConverter.intToRoman(9));
    }

    //10
    @Test
    void shouldConvertFortyToRoman() {
        assertEquals("XL", IntegerToRomanConverter.intToRoman(40));
    }

    //11
    @Test
    void shouldConvertNinetyToRoman() {
        assertEquals("XC", IntegerToRomanConverter.intToRoman(90));
    }

    //12
    @Test
    void shouldConvertFourHundredToRoman() {
        assertEquals("CD", IntegerToRomanConverter.intToRoman(400));
    }

    //13
    @Test
    void shouldConvertNineHundredToRoman() {
        assertEquals("CM", IntegerToRomanConverter.intToRoman(900));
    }

    //14
    @Test
    void shouldConvertTwentyToRoman() {
        assertEquals("XX", IntegerToRomanConverter.intToRoman(20));
    }

    //15
    @Test
    void shouldConvertFortyFiveToRoman() {
        assertEquals("XLV", IntegerToRomanConverter.intToRoman(45));
    }

    //16
    @Test
    void shouldConvertNinetyNineToRoman() {
        assertEquals("XCIX", IntegerToRomanConverter.intToRoman(99));
    }

    //17
    @Test
    void shouldConvertTwoHundredFiftyToRoman() {
        assertEquals("CCL", IntegerToRomanConverter.intToRoman(250));
    }
    //18
    @Test
    void shouldConvertSevenHundredNinetyToRoman() {
        assertEquals("DCCXC", IntegerToRomanConverter.intToRoman(790));
    }

    //19
    @Test
    void shouldConvertNineteenHundredToRoman() {
        assertEquals("MCM", IntegerToRomanConverter.intToRoman(1900));
    }

    //20
    @Test
    void shouldConvertTwoThousandFourHundredFiftyToRoman() {
        assertEquals("MMCDL", IntegerToRomanConverter.intToRoman(2450));
    }

    //21
    @Test
    void shouldConvertThreeThousandToRoman() {
        assertEquals("MMM", IntegerToRomanConverter.intToRoman(3000));
    }

    //22
    @Test
    void shouldConvertThreeThousandThreeHundredThirtyThreeToRoman() {
        assertEquals("MMMCCCXXXIII", IntegerToRomanConverter.intToRoman(3333));
    }

    //23
    @Test
    void shouldConvertFourThousandToRoman() {
        assertEquals("MMMCMXCIX", IntegerToRomanConverter.intToRoman(3999));
    }

    //24
    @Test
    void shouldConvertFiveThousandToRoman() {
        assertEquals("DCCLXXVII", IntegerToRomanConverter.intToRoman(777));
    }

    //25
    @Test
    void shouldConvertSixThousandToRoman() {
        assertEquals("MMDLV", IntegerToRomanConverter.intToRoman(2555));
    }
}