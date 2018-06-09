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

        for(int i=0;i<s.length();i++) {
            int a = Character.getNumericValue(s.charAt(i));
            if (a >= 0 && a <= 9)
                numCount++;

           /* if( Integer.parseInt(String.valueOf(s.charAt(i)))>=0 && Integer.parseInt(String.valueOf(s.charAt(i)))<=9)
                numCount++;*/
        }
        if(numCount>0)
        return true;
        else
            return false;
    }
    public static boolean checkVowel(String s){
        char[] vowels = {'a','e','i','o','u'};

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for(int k =0;k<vowels.length;k++){
                if(c == vowels[k])
                    vowCount++;
            }
        }
        if(vowCount>=3)
            return true;
        else
            return false;


    }

}
