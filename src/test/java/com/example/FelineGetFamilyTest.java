package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {
    @Test
    public void assertThatGetFamilyEqualsFeline(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }
}
