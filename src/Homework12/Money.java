package Homework12;

import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Test.correctCurrency();
        Test.correctNumber();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число (например 123.45): ");
            double amount = scanner.nextDouble();
            int mainAmount = (int) amount;
            int fractionalAmount = (int) Math.round((amount - mainAmount) * 100);

            if (mainAmount > 0 && mainAmount < 1000) {
                String mainWord = NumToWords.numberToWords(mainAmount, true);
                String mainCurrency = Currency.RUBLE.getMainForm(mainAmount);

                if (fractionalAmount == 0) {
                    System.out.println(mainWord + " " + mainCurrency);

                } else {
                    String fractionalWord = NumToWords.numberToWords(fractionalAmount, false); // Это для копейки, у цента мужской род
                    String fractionalCurrency = Currency.RUBLE.getFractionalForm(fractionalAmount);
                    System.out.println(mainWord + " " + mainCurrency + " и " + fractionalWord + " " + fractionalCurrency);
                }
            } else {
                System.out.println("Целая часть числа должна быть в диапазоне от 1 до 999.");
            }
        }
    }
}
