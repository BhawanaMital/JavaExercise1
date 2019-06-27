package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckLetterTest {
    CheckLetter checkLetter;

    @Before
    public void setUp() throws Exception {
    checkLetter=new CheckLetter();
    }


    @After
    public void tearDown() throws Exception {
    checkLetter=null;
    }

    @Test
    public void returnCapitalLetter() {
        String result=checkLetter.checkInput('A');
        assertEquals("Capital Letter",result);
    }


    @Test
    public void returnSmallLetter() {
        String result=checkLetter.checkInput('a');
        assertEquals("Small Letter",result);
    }


    @Test
    public void returnDigit() {
        String result=checkLetter.checkInput('9');
        assertEquals("Digit",result);
    }


    @Test
    public void returnSpecialSymbol() {
        String result=checkLetter.checkInput('@');
        assertEquals("Special Symbols",result);
    }
}