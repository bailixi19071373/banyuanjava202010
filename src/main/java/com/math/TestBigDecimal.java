package com.math;

import java.math.BigDecimal;

public class TestBigDecimal {
    public static void main(String[] args) {
        System.out.println(0.1+0.2);
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2));
    }
}
