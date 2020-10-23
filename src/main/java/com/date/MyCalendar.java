package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class MyCalendar {
  public static void main(String[] args) throws ParseException {
	  System.out.println("请输入日期(yyyy-MM-dd):");
	  Scanner in = new Scanner(System.in);
	  String s  = in.next();
	  //2019-11-12
	  SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
	  Date d = f.parse(s);
	  System.out.println("日\t一\t二\t三\t四\t五\t六");
	  Calendar c = Calendar.getInstance();
	  c.setTime(d);
	  int theDay = c.get(Calendar.DATE);
	  c.set(Calendar.DATE, 1);
	  int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
	  for (int i = 0; i < dayOfWeek-1; i++) {
		System.out.print("\t");
	}

	  int lastDay = c.getActualMaximum(Calendar.DATE);
	  for (int i = 1; i <= lastDay; i++) {
		  if(i == theDay)
			  System.out.print("*");
		System.out.print(i+"\t");
		c.set(Calendar.DATE, i);
		if(c.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY) {
			System.out.println();
		}
	}
}
}
