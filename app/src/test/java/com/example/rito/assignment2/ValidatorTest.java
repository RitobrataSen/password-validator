package com.example.rito.assignment2;
import org.junit.Test;

import java.util.regex.Pattern;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class ValidatorTest {

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
}
