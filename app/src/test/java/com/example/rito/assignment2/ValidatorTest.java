package com.example.rito.assignment2;
import org.junit.After;
import org.junit.Test;

import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class ValidatorTest {


    @After
    public void afterTests(){
        System.out.println("Password is Strong");
    }
    @Test
    public void Validator_checkLength(){
        assertTrue(Validator.checkLength("HelloMyNameIs"));
    }

    @Test
    public void Validator_checkPassword(){
        String s= "asdfghjkl";
        assertTrue(Validator.checkPass(s));
        assertTrue(Validator.checkLength(s));
    }

    @Test
    public void Validator_CheckStr(){
        String s = "hellomynameis";
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
}
