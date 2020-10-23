package com.date;

import sun.font.FontRunIterator;

import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.setFirstDayOfWeek(Calendar.MONDAY);
        c.setTime(new Date());
        int dow = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(dow);
        //1 2 3 4 5 6 7
        //2 3 4 5 6 7 1
       // m = n + 6 % 7;

        for (int i = 1; i <= 7; i++) {
            System.out.println((i + 6)%7);
        }
    }

}
