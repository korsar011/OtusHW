package Homework7;

// Класс заглушка
public class Statistics implements AutoCloseable {
    public int correctAnswers = 0;
    public int falseAnswers = 0;

    public void addCorrectAnswer() {
        correctAnswers++;
    }

    public void addFalseAnswer() {
        falseAnswers++;
    }

    public void showResults() {
        System.out.println("\nПравильных ответов: " + correctAnswers);
        System.out.println("Неправильных ответов: " + falseAnswers);
    }

    @Override
    public void close() {
        // Реализация закрытия ресурса
    }
}
