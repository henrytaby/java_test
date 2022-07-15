package com.taby.java_test.util;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_once(){
        Assert.assertEquals("hola",StringUtil.repeat("hola",1));
    }
    @Test
    public void repeat_string_multiple_times(){
        Assert.assertEquals("holaholahola",StringUtil.repeat("hola",3));
    }
    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("",StringUtil.repeat("hola",0));
    }
    @Test (expected = IllegalArgumentException.class)
    public void repeat_string_negative_times(){
        StringUtil.repeat("hola",-1);
    }

    @Test
    public void test_string_is_no_empty() {
        assertFalse(StringUtil.isEmpty("hola"));
    }
    @Test
    public void empty_quote_is_string_empty() {
        assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void null_is_string_empty() {
        assertTrue(StringUtil.isEmpty(null));
    }
    @Test
    public void string_space_is_string_empty() {
        assertTrue(StringUtil.isEmpty(" "));
    }
}
