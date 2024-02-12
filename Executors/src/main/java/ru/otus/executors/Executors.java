package ru.otus.executors;


public class Executors {

	public static void main(String[] args) {
		NumPrinter numPrinter = new NumPrinter();
		Thread thread1 = new Thread(() -> numPrinter.numPrint(1));
		Thread thread2 = new Thread(() -> numPrinter.numPrint(2));

		thread1.start();
		thread2.start();
	}
}




