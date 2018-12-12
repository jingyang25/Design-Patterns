package com.test.yang.func;

public class LongFactory implements Factory {


    @Override
    public Sweater getSweater() {

        return new LongSweater();
    }
}
