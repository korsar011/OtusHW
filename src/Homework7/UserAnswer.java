package Homework7;

import java.util.Scanner;

public class UserAnswer {
    public int[] getAnswer(int[] listSize) {
        Scanner scan = new Scanner(System.in);
        int[] userAnswers = new int[listSize.length];
        for (int i = 0; i < listSize.length; i++) {
            System.out.println("Введите число " + (i + 1) + ":");
            userAnswers[i] = scan.nextInt();
        }
        return userAnswers;
    }

}