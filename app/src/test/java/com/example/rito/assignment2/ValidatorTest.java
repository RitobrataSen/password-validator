package com.example.rito.assignment2;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class ValidatorTest {


    @After
    public void afterTests(){
        System.out.println("Test Passed");
    }
    @Test
    public void Validator_checkLength(){
        assertTrue(Validator.checkLength("HelloMyNameIs"));
    }

    @Test
    public void Validator_checkPassword(){
        String s= "notpassword";
        assertTrue(Validator.checkPass(s));

    }

    @Test
    public void Validator_CheckStr(){
        String s = "HellouMyNameIs123";
        assertTrue(Validator.checkStr(s));
    }

    @Test
    public void Validate_Num(){
        String s= "Hello1";
        assertTrue(Validator.checkNum(s));
    }


    @Test
    public void ValidateVowels(){
        String s = "Hellouu1";
        assertTrue(Validator.checkVowel(s));
    }
    @Test
    public void ValidateCap(){
        String s = "HelloASF";
        assertTrue(Validator.checkCap(s));
    }
    @AfterClass
    public static void StrongPass(){
        System.out.println("Password meets all criteria");
    }

}
