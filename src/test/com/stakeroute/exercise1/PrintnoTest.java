package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintnoTest {
    Printno printno;
    @Before
    public void setUp() throws Exception {
        printno=new Printno();
    }

    @After
    public void tearDown() throws Exception {
        printno=null;
    }

    @Test
    public void returnCountNum() {
        String result=printno.Count_no(3);
        assertEquals("1 2 2 3 3 3 ",result);
    }
}