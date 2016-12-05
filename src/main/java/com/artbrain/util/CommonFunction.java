package com.artbrain.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/12/4 0004.
 */
public class CommonFunction {

    public static final SimpleDateFormat FORMAT = new SimpleDateFormat(
            "yy/MM/dd HH:mm");

    public static Boolean compare(Date d1, Date d2) {
        String str1 = FORMAT.format(d1);
        System.out.println("str1: " + str1);
        String str2 = FORMAT.format(d2);
        System.out.println("str2: " + str2);

        int result = str1.compareTo(str2);
        if (result > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2016-12-4");
        Boolean flag = compare(d1, d2);
        System.out.println(flag);
    }

}
