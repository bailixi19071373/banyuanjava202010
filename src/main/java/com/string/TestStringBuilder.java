package com.string;

public class TestStringBuilder {
    public static void main(String[] args) {
        String s = "abcdefg";
        StringBuilder sb = new StringBuilder(s);
        String rs = sb.reverse().toString();
        System.out.println(rs);
    }
}
