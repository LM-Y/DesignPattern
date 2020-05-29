package com.creation.singleton;

import org.junit.Test;

/**
 * @Author : Ming
 * @Description : 饿汉模式测试
 * @Date : 2020/5/26
 * @Modify by :
 */
public class HungrySingletonTest {

    @Test
    public void test() {
        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        if (hungrySingleton == hungrySingleton1) {
            System.out.println("是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }
    }
}
