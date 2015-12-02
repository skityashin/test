package com.levelup.main1;

import java.util.HashMap;

public class Main  extends Thread{
    private int num;
    private HashMap <Integer, Integer> res;

    public Main(HashMap <Integer, Integer> res, int num) {
        this.num = num;
        this.res = res;
    }

    @Override
    public void run(){
        Integer finish = (num+1)*10;
        res.put(num, 0);
        for(Integer start = num*10; finish > start; start++){
            Integer result = res.get(num);
            res.put(num, (result + start));
        }
    }
}
