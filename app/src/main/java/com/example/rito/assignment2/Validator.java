package com.example.rito.assignment2;

public class Validator {

    public static boolean checkLength(String s){
        if(s.length()>=8)
            return true;
        else
            return false;
    }
    public static boolean checkPass(String s){
        if(s.toLowerCase()!="password")
            return true;
        else
            return false;
    }
}
