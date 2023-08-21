package Homework12;

public class NumToWords {
    public static String numberToWords(int n, boolean isMale) {
        String[] ones;
        if (isMale) {
            ones = new String[]{"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        } else {
            ones = new String[]{"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        }

        String[] teens = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать"};
        String[] tens = {"", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто"};
        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};

        int h = n / 100;
        int t = (n % 100) / 10;
        int o = n % 10;

        StringBuilder words = new StringBuilder();

        if (h > 0) {
            words.append(hundreds[h]).append(" ");
        }

        if (t == 1) {
            words.append(teens[o]);
        } else {
            if (t > 0) {
                words.append(tens[t]).append(" ");
            }
            if (o > 0) {
                words.append(ones[o]);
            }
        }


        return words.toString().trim();
    }
}
