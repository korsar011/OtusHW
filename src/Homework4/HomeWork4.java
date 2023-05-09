package HomeWork4;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {

        System.out.println("Тест по географии");
        // Массив вопросов
        String[] questionText = {
                "Вопрос 1. Назовите столицу Франции",
                "Вопрос 2. Назовите столицу Мадагаскара",
                "Вопрос 3. Назовите столицу Непала",
                "Вопрос 4. Назовите столицу Казахстана"};

        // Массив вариантов ответов
        String[][] answerOptions = {
                {"1. Берлин", "2. Лондон", "3. Париж", "4. Лиссабон"},
                {"1. Антананариву", "2. Кейптаун", "3. Каир", "4. Аккра"},
                {"1. Дели", "2. Бангкок", "3. Катманду", "4. Покхара"},
                {"1. Алма-Ата", "2. Усть-Каменогорск", "3. Бишкек", "4. Астана"}
        };

        // Массив правильных ответов
        int[] correctAnswer = {3, 1, 3, 4};

        Question[] questions = new Question[questionText.length];

        for (int i = 0; i < questionText.length; i++) {
            questions[i] = new Question(questionText[i], answerOptions[i], correctAnswer[i]);
        }

        Test test = new Test(questions);
        test.run();
    }
}