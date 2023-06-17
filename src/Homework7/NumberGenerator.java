package Homework7;

import java.util.Random;
import java.util.Scanner;


public class NumberGenerator {

    public int[] generateNumbers(int amountOfNumbers) throws NegativeNumberException {
        if (amountOfNumbers < 0) {
            throw new NegativeNumberException("Количество чисел не может быть отрицательным");
        }

        int[] numbers = new int[amountOfNumbers];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(0, 10000);
        }
        return numbers;
    }
}

