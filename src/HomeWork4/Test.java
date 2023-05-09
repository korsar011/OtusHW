package HomeWork4;

import java.util.Scanner;

public class Test {
    private Question[] questions;
    private int correctCount;
    private int wrongCount;

    public Test (Question[] questions) {
        this.questions = questions;
        this.correctCount = 0;
        this.wrongCount = 0;
    }

    public void run () {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            String [] answerOptions = question.getAnswerOptions();
            for (String option : answerOptions){
                System.out.println(option);
            }

//            // Отсеивание некорректных чисел
            int answer = 0;
            while (answer < 1 || answer > answerOptions.length) {
                System.out.println();
                System.out.println("Пожалуйста, укажите номер верного ответа: ");
                answer = scanner.nextInt();
                if (answer < 1 || answer > answerOptions.length) {
                    System.out.println("Вы ввели некорректный номер. Пожалуйста, выберите номер от существующего варианта ответа.");
                }
            }
            // Проверка ответа
            if (answer == question.getCorrectAnswers()) {
                System.out.println("Правильно!");
                correctCount++;
            } else {
                System.out.println("Неправильно.");
                wrongCount++;
            }
            System.out.println();
        }
        // Вывод результата
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}