package Homework3;

import java.util.Scanner;

public class HomeWork3new {

    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;
        System.out.println("Тест по географии");
        // Массив вопросов
        String[] question = new String[4];
        question[0] = "Вопрос 1. Назовите столицу Франции";
        question[1] = "Вопрос 2. Назовите столицу Мадагаскара";
        question[2] = "Вопрос 3. Назовите столицу Непала";
        question[3] = "Вопрос 4. Назовите столицу Казахстана";

        // Массив вариантов ответов
        String[][] answerOptions = new String[4][4];
        answerOptions[0][0] = "1. Берлин";
        answerOptions[0][1] = "2. Лондон";
        answerOptions[0][2] = "3. Париж";
        answerOptions[0][3] = "4. Лиссабон";

        answerOptions[1][0] = "1. Антананариву";
        answerOptions[1][1] = "2. Кейптаун";
        answerOptions[1][2] = "3. Каир";
        answerOptions[1][3] = "4. Аккра";

        answerOptions[2][0] = "1. Дели";
        answerOptions[2][1] = "2. Бангкок";
        answerOptions[2][2] = "3. Катманду";
        answerOptions[2][3] = "4. Покхара";

        answerOptions[3][0] = "1. Алма-Ата";
        answerOptions[3][1] = "2. Усть-Каменогорск";
        answerOptions[3][2] = "3. Бишкек";
        answerOptions[3][3] = "4. Астана";


        // Массив правильных ответов
        int[] correctAnswers = new int[4];
        correctAnswers[0] = 3;
        correctAnswers[1] = 1;
        correctAnswers[2] = 3;
        correctAnswers[3] = 4;

        Scanner scanner = new Scanner(System.in);
        // Цикл по всем вопросам
        for (int i = 0; i < question.length; i++) {
            System.out.println(question[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }

            System.out.print("Пожалуйста, укажите номер верного ответа: ");
            int answer = scanner.nextInt();
            if (answer == correctAnswers[i]) {
                System.out.println("Правильно!");
                correctCount++;
            } else {
                System.out.println("Неправильно.");
                wrongCount++;
            }

            System.out.println();
        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
