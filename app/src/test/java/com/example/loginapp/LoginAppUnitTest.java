package com.example.loginapp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginAppUnitTest {

    @Test
    public void  email_isCorrect() {
        assertEquals("beril@gmail.com", MainActivity.email_txt);
    }

    @Test
    public void password_isCorrect() {
        String message = "123456789";
        assertTrue(message.equals(MainActivity.password_txt));
    }

    @Test
    public void password_isCorrect2() {
        assertEquals("123456789",MainActivity.password_txt);
    }


    @Test
    public void bool1() {
        assertFalse(MainActivity.isAllFieldsChecked==true);
    }

    @Test
    public void bool2() {
        boolean x = true;
        assertEquals(true,MainActivity.isAllFieldsChecked);
    }
}