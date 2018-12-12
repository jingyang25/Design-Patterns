package com.test.yang.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Agent implements MethodInterceptor {


    public Object getInstance(Class clazz){

        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        return enhancer.create();
    }



    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("see house");
        System.out.println("find house");
        proxy.invokeSuper(obj,args);
        System.out.println("end");
        return null;
    }
}
