package com.test.yang.cglib;

public class TestCglib {

    public static void main(String[] args){

        Person obj = (Person) new Agent().getInstance(Tenant.class);

        obj.rentHouse();

        System.out.println("被代理的类为"+obj.getClass());
    }
}
