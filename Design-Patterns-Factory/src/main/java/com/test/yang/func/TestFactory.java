package com.test.yang.func;

public class TestFactory {

    public static void main(String[] args){
    Factory factory = new ShortFactory();
    System.out.println(factory.getSweater());

        Factory factory2 = new LongFactory();
        System.out.println(factory2.getSweater());



    }
}
