package Homework5;

import java.util.ArrayList;
import java.util.Collections;


public class Homework5 {

    private static ArrayList <Integer> sort (ArrayList <Integer> list){
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Обмен элементов
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
                   }
        return list;
    }



    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(-1);
        list.add(9);
        list.add(3);
        list.add(15);
        list.add(-7);
        list.add(19);

        System.out.println("Исходный список: " + list);
        long start = System.currentTimeMillis();
        sort(list);
        long end = System.currentTimeMillis();
        System.out.println("Отсортированный список: " + list);
        System.out.println("Затраченное время: " + (end-start)+ " мс");

        long start1 = System.currentTimeMillis();
        Collections.sort(list);
        long end1 = System.currentTimeMillis();
        System.out.println("Сравнение с Collections.sort сортировкой: " + list);
        System.out.println("Затраченное время: " + (end1-start1)+ " мс");
    }

}
