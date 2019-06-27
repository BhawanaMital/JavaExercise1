package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortDigitTest {
    SortDigit sortDigit;
    @Before
    public void setUp() throws Exception {
        sortDigit=new SortDigit();
    }

    @After
    public void tearDown() throws Exception {
        sortDigit=null;
    }

    @Test
    public void returnSortNumberFalse() {
        String result=sortDigit.sortNumber(32078);
        assertEquals("87320 \nSum of even numbers : 10\nFalse",  result);
    }

    @Test
    public void returnSortNumberTrue() {
        String result=sortDigit.sortNumber(8823);
        assertEquals("8832 \nSum of even numbers : 18\nTrue",  result);
    }
}