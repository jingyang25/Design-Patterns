package com.test.yang.jdk;

public class SuperStar implements Person {

    @Override
    public void sellTickets() {
        System.out.println("sell tickets");
    }

    @Override
    public void concert() {
        System.out.println("Singing and Dancing");
    }
}
