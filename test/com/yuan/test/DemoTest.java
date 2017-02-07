package com.yuan.test;

import com.testpack.children.Dog;
import com.testpack.parent.Cat;
import org.junit.Test;

/**
 * Created by zhangyuanyuan031 on 2017/1/23.
 */
public class DemoTest {

    @Test
    public void testDog() throws Exception{
        Dog dog = new Dog();
//        dog.bark();

        Cat cat = new Cat();
        cat.bark();

    }

    @Test
    public void testDemo() throws Exception{
        System.err.println("hello word");
    }
}
