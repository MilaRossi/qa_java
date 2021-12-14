package com.example;

public class Program {
    public static void main (String[] args) throws Exception {
        Feline myFeline = new Feline();
        Lion myLion = new Lion("Самец", myFeline);
        System.out.println(myLion.getFood());

    }
}
