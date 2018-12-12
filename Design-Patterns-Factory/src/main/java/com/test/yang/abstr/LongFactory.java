package com.test.yang.abstr;

import com.test.yang.func.LongSweater;
import com.test.yang.func.Sweater;

public class LongFactory extends AbstractFactory {
    @Override
    protected Sweater getSweater() {
        return  new LongSweater();
    }
}
