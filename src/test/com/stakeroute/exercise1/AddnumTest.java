package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddnumTest {
    Addnum addnum;
    @Before
    public void setUp() throws Exception {
        addnum=new Addnum();
    }

    @After
    public void tearDown() throws Exception {
        addnum=null;
    }


    @Test
    public void returnAddednum() {

        int actualResult=addnum.sumOfNumbers("12 23 2 4");
        assertEquals(41,actualResult);
    }
}