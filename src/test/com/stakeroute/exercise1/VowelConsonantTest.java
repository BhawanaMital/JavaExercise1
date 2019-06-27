package com.stakeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant vowelConsonant;

    @Before
    public void setUp() throws Exception {
    vowelConsonant =new VowelConsonant();
    }


    @After
    public void tearDown() throws Exception {
    vowelConsonant=null;
    }


    @Test
    public void returnVowelConsonant() {
        String result=vowelConsonant.VowCon("bhaw");
        assertEquals(" Consonant Consonant Vowel Consonant ",result);
    }


    @Test
    public void returnError() {
        String result=vowelConsonant.VowCon("bhaw5");
        assertEquals("error",result);
    }
}