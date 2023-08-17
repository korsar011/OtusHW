package Homework12;

public class Currency {
    public static String currencyForm(int n) {
        if (n % 10 == 1 && n % 100 != 11) {
            return "рубль";
        } else if (2 <= n % 10 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            return "рубля";
        } else {
            return "рублей";
        }
    }
}
