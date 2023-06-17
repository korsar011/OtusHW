package Homework7;

import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
        try (Statistics resource = new Statistics()) {
            AmountAsker asker = new AmountAsker();
            int result = asker.askForAmount();

            int[] numbers;
            try {
                NumberGenerator numberGenerator = new NumberGenerator();
                numbers = numberGenerator.generateNumbers(result);
                System.out.println(Arrays.toString(numbers));
            } catch (NegativeNumberException e) {
                System.out.println("Вы ввели отрицательное число, создано число с минимальными допустимыми параметрами: ");
                NumberGenerator numberGenerator = new NumberGenerator();
                numbers = numberGenerator.generateNumbers(1);
                System.out.println(Arrays.toString(numbers));
            }

            UserAnswer userAnswers = new UserAnswer();
            Gap.hideNumbers();
            int[] userNumbers = userAnswers.getAnswer(numbers);
            System.out.println(Arrays.toString(userNumbers));

            ComparingAnswers.answersCompare(numbers, userNumbers, resource);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}
