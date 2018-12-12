package com.test.yang;

public class Dispatcher implements Executor {

    Executor executor;

    public Dispatcher(Executor executor) {
        this.executor = executor;
    }

    @Override
    public void party() {
        this.executor.party();
    }
}
