package com.math;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
      /*  Random r = new Random(10);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }*/
      //生成【20-80】之间的随机整数
      int r1 = (int)(20+Math.random()*61);
      Random ran = new Random();
      int r2 = 20 + ran.nextInt(41);
    }
}
