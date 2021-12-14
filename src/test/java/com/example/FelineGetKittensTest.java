package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensTest {
    public int kittensCount;
    public int expected;

    public FelineGetKittensTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[][] {
                {0,0},
                {-1,-1}
        };
    }
// параметризованный тест на метод public int getKittens(int kittensCount)
    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }

}


