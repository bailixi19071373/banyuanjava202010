package com.math;

import java.math.BigInteger;

public class TestBigInteger {

    public static void main(String[] args) {
//        long l = 90000000000000000000000L;
        //底层用int[]实现
        BigInteger b = new BigInteger("90000000000000000000000");
        BigInteger b2 = b.add(new BigInteger("1"));
        long l = b2.longValue();//不会校验精度
        long l2 = b2.longValueExact();//会校验精度，越界则抛出异常
        System.out.println(l);
    }
}
