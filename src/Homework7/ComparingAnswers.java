package Homework7;

public class ComparingAnswers {
    public static void answersCompare(int[] numbers, int[] userNumbers, Statistics resource) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == userNumbers[i]) {
                System.out.println("\nЧисло " + (i + 1) + " было введено верно.");
                resource.addCorrectAnswer();
            } else {
                System.out.println("Число " + (i + 1) + " было введено неверно.");
                resource.addFalseAnswer();
            }
        }
        resource.showResults();
    }
}
