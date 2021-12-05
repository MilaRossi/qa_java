package com.example;

public class Program {
    public static void main (String[] args) throws Exception {
        Feline myFeline = new Feline();
//        Cat barsic = new Cat(myFeline);
        Lion myLion = new Lion("Самец", myFeline);
//        System.out.println(barsic.getFood());
        System.out.println(myLion.getFood());

    }
}
