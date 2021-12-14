package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionExceptionTest {
    @Test(expected = Exception.class)
    public void assertThatLion() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Неопределенность", feline);
    }
}
