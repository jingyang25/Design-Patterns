package com.test.yang.simple;

public class TestSimpleFactory {

    public static void main(String[] args){

        Sweater sweater = new SimpleFactory().getSweater ("ShortSweater");

        System.out.println(sweater.check());
    }
}
