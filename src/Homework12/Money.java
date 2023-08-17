package Homework12;


import java.util.Scanner;

public class Money {

    public static void main(String[] args) {
        Test.correctCurrency();
        Test.correctNumber();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
              if (number > 0 && number < 1000) {
        String numberWord = NumToWords.numberToWords(number);
        String currency = Currency.currencyForm(number);
        System.out.println(numberWord+" "+currency);} else {
            System.out.println("Число должно быть в диапазоне от 1 до 999.");
        }

    }
    }
}
