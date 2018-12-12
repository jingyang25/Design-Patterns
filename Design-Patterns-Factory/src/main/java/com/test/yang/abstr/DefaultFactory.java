package com.test.yang.abstr;

import com.test.yang.func.Sweater;

public class DefaultFactory extends AbstractFactory{

    private ShortFactory defaultFactory = new ShortFactory();

    public Sweater getSweater(){
        return defaultFactory.getSweater();
    }



}
