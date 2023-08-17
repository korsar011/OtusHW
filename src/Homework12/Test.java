package Homework12;

public class Test {
    public static void correctCurrency() {
        if (Currency.currencyForm(137).equals("рублей")) {
            System.out.println("Тест на корректную форму валюты пройден при значении 137");
        } else {
            System.err.println("Тест на корректную форму валюты не пройден при значении 137");
        }
        if (Currency.currencyForm(1).equals("рубль")) {
            System.out.println("Тест на корректную форму валюты пройден при значении 1");
        } else {
            System.err.println("Тест на корректную форму валюты не пройден при значении 1");
        }
        if (Currency.currencyForm(2).equals("рубля")) {
            System.out.println("Тест на корректную форму валюты пройден при значении 2");
        } else {
            System.err.println("Тест на корректную форму валюты не пройден при значении 2");
        }
    }

    public static void correctNumber() {
        try {
            NumToWords.numberToWords(1001);
            System.err.println("Тест не пройден, метод допустил число более 999");
        } catch (Exception e) {
            System.out.println("Тест пройден, метод вызвал исключение при числе более 999");
        }
    }
}