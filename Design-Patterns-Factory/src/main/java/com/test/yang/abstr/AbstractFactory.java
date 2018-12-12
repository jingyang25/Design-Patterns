package com.test.yang.abstr;

import com.test.yang.func.Sweater;

public  abstract class AbstractFactory {

    protected abstract Sweater getSweater();

    public Sweater getSweater(String name){
        if("short sweater".equalsIgnoreCase(name)){
            return new ShortFactory().getSweater();
        }else if("long sweater".equalsIgnoreCase(name)){
            return new LongFactory().getSweater();
        }else{
            System.out.println("无法生产");
            return null;
        }
    }


}
