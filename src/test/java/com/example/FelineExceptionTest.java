package com.example;

import org.junit.Test;

// тест на проверку исключений метода eatMeat класса Feline
public class FelineExceptionTest {
    @Test(expected = Exception.class)
    public void FelineWithExceptionTest() throws Exception {
       Animal animal = new Animal();
       animal.getFood("");
    }
}
