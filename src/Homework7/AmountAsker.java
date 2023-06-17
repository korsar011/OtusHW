package Homework7;

import java.io.IOException;
import java.util.Scanner;

public class AmountAsker {

    Scanner scan = new Scanner(System.in);

    public int askForAmount() throws Exception{
        System.out.println("Введите желаемое количество чисел, которые необходимо запомнить:");
        int amountOfNumbers = 0;
       while (true) {
           try{
            amountOfNumbers = scan.nextInt();
            break;
           } catch (Exception e) {
               System.out.println ("Вы должны ввести число.");
               scan.nextLine();
           }
        }
        return amountOfNumbers;
    }
}
