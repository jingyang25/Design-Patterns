package com.test.yang.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Agent implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target){

        this.target = target;
        Class clazz = target.getClass();

        return  Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
       System.out.println("I am agent I will sell tickets");

       method.invoke(target,args);
       System.out.println("concert end");
        return null;
    }
}
