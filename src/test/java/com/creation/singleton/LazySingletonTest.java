package com.creation.singleton;

import org.junit.Test;

/**
 * @Author : Ming
 * @Description : 懒汉单例测试
 * @Date : 2020/5/25
 * @Modify by :
 */

public class LazySingletonTest {
    @Test
    public void test() {
        LazySingleton lsn = LazySingleton.getInstance();
        LazySingleton lsn1 = LazySingleton.getInstance();
        if (lsn == lsn1) {
            System.out.println("是同一个实例");
        } else {
            System.out.println("不是一个实例");
        }
    }

}
