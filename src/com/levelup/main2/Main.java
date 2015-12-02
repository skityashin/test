package com.levelup.main2;

public class Main extends Thread{
    public static int sumTotal;
    private int num;
    private int res;

    public static int getSumTotal() {
        return sumTotal;
    }
    public Main(int res, int num) {
        this.num = num;
        this.res = res;
    }
    @Override
    public void run(){
        for(int i = res; i < num; i++){
            sumTotal += i;
        }

    }
}
