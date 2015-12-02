package com.levelup.main2;

public class First {

    static Main sum1;
    static Main sum2;
    static Main sum3;
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        Thread sum1 = new Thread(new Main(0, 10));
        Thread sum2 = new Thread(new Main(10, 20));
        Thread sum3 = new Thread(new Main(20, 30));

        sum1.start(); 			//Запуск 1 потока
        sum2.start(); 			//Запуск 2 потока
        sum3.start(); 			//Запуск 3 потока

        try {
            sum1.join();
            sum2.join();
            sum3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ST: " + Main.getSumTotal());
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) );

    }
}
