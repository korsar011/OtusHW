package Homework12;

public class Test {

    public static void main(String[] args) {
        correctCurrency();
        correctNumber();
    }

    public static void correctCurrency() {
        int[] rubl = {1, 21, 101, 121};
        int[] rublya = {2, 3, 4, 22, 23, 102, 103, 104, 122, 123, 124};
        int[] rubley = {5, 11, 12, 15, 20, 25, 30, 100, 105, 110, 111, 112, 115, 120, 125};

        checkForm(rubl, "рубль", true);
        checkForm(rublya, "рубля", true);
        checkForm(rubley, "рублей", true);
    }

    private static void checkForm(int[] numbers, String expectedForm, boolean isMainCurrency) {
        for (int number : numbers) {
            String form = isMainCurrency ? Currency.RUBLE.getMainForm(number) : Currency.RUBLE.getFractionalForm(number);
            if (form.equals(expectedForm)) {
                System.out.println("Тест на корректную форму валюты пройден при значении " + number);
            } else {
                System.err.println("Тест на корректную форму валюты не пройден при значении " + number + ". Получено: " + form + ", ожидалось: " + expectedForm);
            }
        }
    }

    public static void correctNumber() {
        try {
            NumToWords.numberToWords(1001, true);
            System.err.println("Тест не пройден, метод допустил число более 999");
        } catch (Exception e) {
            System.out.println("Тест пройден, метод вызвал исключение при числе более 999");
        }
    }
}
