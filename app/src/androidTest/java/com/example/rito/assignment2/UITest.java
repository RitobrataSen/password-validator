package com.example.rito.assignment2;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.espresso.Espresso;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;

@RunWith(AndroidJUnit4.class)

@LargeTest
public class UITest {

    @Test
    public void checkTextField(){
        Espresso.onView(ViewMatchers.withId(R.id.editText));
    }

    @Test
    public void checkButton(){
        Espresso.onView((ViewMatchers.withId(R.id.button)));
    }

    
}
