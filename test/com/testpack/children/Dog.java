package com.testpack.children;

import com.testpack.parent.Animail;

/**
 * Created by zhangyuanyuan031 on 2017/2/7.
 */
public class Dog extends Animail {
    public void bark(){
        System.out.println("狗在叫呢");
        this.eat();

    }
}
