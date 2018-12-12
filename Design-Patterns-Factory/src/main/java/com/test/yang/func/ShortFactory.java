package com.test.yang.func;

public class ShortFactory implements Factory{
    @Override
    public Sweater getSweater() {
        return new ShortSweater();
    }
}
