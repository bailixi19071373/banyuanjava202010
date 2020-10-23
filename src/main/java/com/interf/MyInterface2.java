package com.interf;

public interface MyInterface2 {
    default void defaultMethod(){
        System.out.println("MyInterface2默认方法");
    }
}
