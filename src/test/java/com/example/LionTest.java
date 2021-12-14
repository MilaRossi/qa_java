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
}
