package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineOneKittenTest {

    @Test
    public void assertThatKittensCountOne() {
        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}
