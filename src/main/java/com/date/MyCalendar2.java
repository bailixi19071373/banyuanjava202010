package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MyCalendar2 {

    public static void main(String[] args) {
//        String s = "2020-10-23";
        System.out.println("请输入日期(格式为2020-01-01):");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d = sdf.parse(s);
            System.out.println("日\t一\t二\t三\t四\t五\t六");
//            for (int i = 1; i < 31; i++) {
//                System.out.print(i+"\t");
//                if(i % 7 == 0)
//                    System.out.println();
//        }
            Calendar c = Calendar.getInstance();
            c.setTime(d);
            int theDay = c.get(Calendar.DATE);
            //设置成第一天
            c.set(Calendar.DATE, 1);
            int lastDay = c.getActualMaximum(Calendar.DATE);
            //得到1号是星期几，注意，星期天是第一天
            int firstDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            for (int i = 0; i < firstDayOfWeek-1; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= lastDay; i++) {
                if(theDay == i)
                    System.out.print("*");
                System.out.print(i+"\t");
                c.set(Calendar.DATE, i);
                if(c.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                    System.out.println();
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
