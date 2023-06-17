package Homework7;

import java.util.Scanner;

public class Gap {
    public static void hideNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Как будете готовы, введите любой символ и нажмите Enter.");
        String anySymbol = scan.nextLine();
        System.out.println("\n\n\n\nСтарайтесь не подглядывать.\n\n\n\n");
    }
}
