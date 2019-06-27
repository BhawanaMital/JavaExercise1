package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomjerryTest {
    Tomjerry tomjerry;

    @Before
    public void setUp() throws Exception {
        tomjerry=new Tomjerry();
    }

    @After
    public void tearDown() throws Exception {
        tomjerry=null;
    }


    @Test
    public void returnTomIfOdd() {
        String result=tomjerry.checkInt(21);
        assertEquals("Tom",result);
    }

    @Test
    public void returnJerryIfEven() {
        String result=tomjerry.checkInt(28);
        assertEquals("Jerry",result);
    }

}