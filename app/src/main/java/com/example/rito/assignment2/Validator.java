package com.example.rito.assignment2;

public class Validator {

    public static boolean checkStr(String s){
        if(checkLength(s) && checkPass(s))
            return true;
        else
            return false;
    }



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
    public static boolean checkNum(String s){

        int numCount =0;
        boolean m = false;

        for(int i=0;i<s.length();i++)
            if(s.charAt(i)>=0 && s.charAt(i)<=9)
                numCount+=1;

           /* if( Integer.parseInt(String.valueOf(s.charAt(i)))>=0 && Integer.parseInt(String.valueOf(s.charAt(i)))<=9)
                numCount++;*/

        if(numCount>=0)
        return true;
        else
            return false;
    }

}
