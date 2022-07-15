package com.taby.java_test.util;

public class DateUtil {
    public static boolean isLeapYear(int year){
        /*
         if((year % 4 ==0 && year % 100!=0)|| (year % 400 ==0) ){
            return true;
        }else{
            return false;
        }
         */
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
