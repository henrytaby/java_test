package com.taby.java_test.util;

public class StringUtilTest {
    public static void main(String[] args){
        String result = StringUtil.repeat("hola",3);
        System.out.println(result);

        if(!result.equals("holaholahola")){
            System.out.println("ERROR");
        }

        String result2 = StringUtil.repeat("hola",1);
        System.out.println(result2);
        if(!result2.equals("hola")){
            System.out.println("ERROR");
        }
    }
}
