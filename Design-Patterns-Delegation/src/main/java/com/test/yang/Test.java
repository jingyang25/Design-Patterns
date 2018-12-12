package com.test.yang;

public class Test {

    public static void main(String [] args){

        Dispatcher dispatcher = new Dispatcher( new Executor_A());

        dispatcher.party();
    }
}
