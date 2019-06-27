package com.stakeroute.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class palindromeTest {
    Palindrome palindrome;

    @org.junit.Before
    public void setUp() throws Exception {
        palindrome=new Palindrome();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        palindrome=null;
    }

    @org.junit.Test
    public void returnReversPalindromelessthan25() {
        String result=palindrome.palindromereverse(12321);
        assertEquals("12321 is a palindrome number and the sum of even number is less than 25",result);
    }

    @Test
    public void returnReversPalindromegreaterthan25() {
        String result=palindrome.palindromereverse(82828);
        assertEquals("82828 is a palindrome number and the sum of even number is greater than 25",result);
    }

    @Test
    public void returnnotPalindrome() {
        String result=palindrome.palindromereverse(3421);
        assertEquals("3421 is not a palindrome number",result);
    }
}