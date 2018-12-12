package com.test.yang.jdk;

public class TestJDk {

    public static void  main(String[] args){

        Person obj = (Person) new Agent().getInstance(new SuperStar());
        obj.sellTickets();
        obj.concert();
        System.out.println("被代理的类为："+obj.getClass());

    }
}
