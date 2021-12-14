package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionTest {
    @Test
    public void assertThatLionHasMane() throws Exception {
        Feline myFeline = new Feline();
        Lion myLion = new Lion("Самец", myFeline);
        boolean expected = true;
        boolean actual = myLion.doesHaveMane();
        assertEquals(expected, actual);

    }
    @Test
    public void assertThatLionDoesNotHaveMane() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        boolean expected = false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }

    @Test
    public void assertThatLionHasOneKitten() throws Exception{
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected, actual);
    }
}
