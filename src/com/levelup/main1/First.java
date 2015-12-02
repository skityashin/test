package com.levelup.main1;

import java.util.HashMap;
public class First {
    public static void main(String[] args) {
        HashMap <Integer, Integer> summary = new HashMap<Integer, Integer>();
        Thread sum1 = new Thread(new Main(summary, 0), "");
        Thread sum2 = new Thread(new Main(summary, 1), "");
        Thread sum3 = new Thread(new Main(summary, 2), "");
        sum1.start();
        sum2.start();
        sum3.start();
        try {
            sum1.join();
            sum2.join();
            sum3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Integer first = summary.get(0);
        Integer second = summary.get(1);
        Integer third = summary.get(2);
        Integer summary_result = first + second + third;
        System.out.println(summary_result);
    }
}
