package com.test.yang;

public class MyList {

    public void sort(Comparetor comparetor){
        Object obj1 = new Object();
        Object obj2 = new Object();
        comparetor.compareTo(obj1,obj2);
        System.out.println("执行逻辑");
    }
}
