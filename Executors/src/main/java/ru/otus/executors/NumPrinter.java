package ru.otus.executors;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NumPrinter {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    int threadID = 1;
    void numPrint(int thread) {
        lock.lock();
        try {
            for (int i = 1; i <= 10; i++) {
                while (threadID != thread) {
                    condition.await();
                }
                System.out.println("Поток: " + threadID + ", " +"Значение: " + i);
                threadID = 3 - threadID;
                condition.signal();
            }
            for (int i = 9; i > 0; i--) {
                while (threadID != thread) {
                    condition.await();
                }
                System.out.println("Поток: " + threadID + ", " +"Значение: " + i);
                threadID = 3 - threadID;
                condition.signal();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
