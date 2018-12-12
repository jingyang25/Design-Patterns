package com.test.yang.abstr;

import com.test.yang.func.ShortSweater;
import com.test.yang.func.Sweater;

public class ShortFactory extends AbstractFactory {
    @Override
    protected Sweater getSweater() {
        return new ShortSweater();
    }
}
