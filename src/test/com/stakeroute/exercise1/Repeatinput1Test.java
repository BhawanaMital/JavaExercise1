package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Repeatinput1Test {
    Repeatinput1 repeatinput1;
    @Before
    public void setUp() throws Exception {
        repeatinput1=new Repeatinput1();
    }

    @After
    public void tearDown() throws Exception {
        repeatinput1=null;
    }

    @Test
    public void returnStringManipulate() {
        String result=repeatinput1.stringManipulate("Stakeroute",5);
        assertEquals("Stakerouterouterouterouterouteroute",result);
    }
}