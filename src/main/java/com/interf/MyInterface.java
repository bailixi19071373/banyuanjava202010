package com.interf;

public interface MyInterface {

    void abstactMethod();

    static void staticMethod(){
        System.out.println("MyInterface静态方法");
    }

    default void defaultMethod(){
        System.out.println("MyInterface默认方法");
    }
}
