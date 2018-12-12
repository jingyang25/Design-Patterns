package com.test.yang.simple;

public class SimpleFactory {

    public SimpleFactory() {

    }

    public Sweater getSweater(String name){

        if("ShortSweater".equalsIgnoreCase(name)){

            return new ShortSweater();
        }else if("LongSweater".equalsIgnoreCase(name)){

            return new LongSweater();
        }else{
            return null;
        }
    }

}
