/*
@autrhor Denys
@project lb333
@class Main
@version 1.0.0
@sinc 04.04.2025 - 12 - 25
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Число " + number + " у Римському вигляді буде: " + IntegerToRomanConverter.intToRoman(number));
    }
}