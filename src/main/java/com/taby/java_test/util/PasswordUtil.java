package com.taby.java_test.util;

public class PasswordUtil {
    public enum SecurityLevel {
        WEAK, MEDIUM,STRONG
    }

    public static SecurityLevel assessPassword(String passsword){

        if(passsword.length()<8){
            return  SecurityLevel.WEAK;
        }
        if(passsword.matches("[a-zA-Z]+")){
            return  SecurityLevel.WEAK;
        }
        if(passsword.matches("[a-zA-Z0-9]+")){
            return  SecurityLevel.MEDIUM;
        }
        return SecurityLevel.STRONG;
    }
}
