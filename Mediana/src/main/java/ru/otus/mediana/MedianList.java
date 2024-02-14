package ru.otus.mediana;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;

public final class MedianList<T extends Number& Comparable<? super T>> {
    List <T> medianList = new CopyOnWriteArrayList<>();

    public int size(){
        return medianList.size();
    };

    public void add(T item) {
        medianList.add(item);
    };
    public void addAll(List<T> items) {
        medianList.addAll(items);
    }

    public void remove(T item){
        medianList.remove(item);
    };

    public double getMedian() {
        double mediana;
        int size = medianList.size();
        if (size == 0) {
            return Double.NaN;
        }
        Collections.sort(medianList);

        if (size%2==0){
            mediana = (medianList.get(size / 2 - 1).doubleValue() + medianList.get(size / 2).doubleValue()) / 2.0;
        } else {
            mediana = medianList.get(size / 2).doubleValue();
        }
        return mediana;
    }

    public static void main(String[] args) {
        MedianList<Integer> medianListValue = new MedianList<>();
        List<Integer> randomNumbers = generateRandomNumbers(10000000);
        medianListValue.addAll(randomNumbers);
        System.out.println(medianListValue.getMedian());
    }

    private static List<Integer> generateRandomNumbers(int count) {
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            randomNumbers.add(ThreadLocalRandom.current().nextInt());
        }
        return randomNumbers;
    }
}
