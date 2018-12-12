package com.test.yang.abstr;

public class Test {

    public static void  main (String[] args){

        DefaultFactory factory = new DefaultFactory();

        System.out.println(factory.getSweater("short sweater"));
    }
}
