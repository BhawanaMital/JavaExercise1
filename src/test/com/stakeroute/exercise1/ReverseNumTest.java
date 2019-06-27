package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNumTest {
    ReverseNum reverseNum;
    @Before
    public void setUp() throws Exception {
        reverseNum=new ReverseNum();
    }

    @After
    public void tearDown() throws Exception {
        reverseNum=null;
    }

    @Test
    public void retrurnReversenum() {
        String result=reverseNum.Reversenum("london");
        assertEquals("nodnol",result);
    }
}