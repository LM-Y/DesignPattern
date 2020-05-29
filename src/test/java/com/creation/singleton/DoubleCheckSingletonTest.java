package com.creation.singleton;

import org.junit.Test;

/**
 * @Author : Ming
 * @Description : 测试双重验证
 * @Date : 2020/5/26
 * @Modify by :
 */
public class DoubleCheckSingletonTest {

    @Test
    public void test(){

        DoubleCheckSingleton doubleCheckSingleton = DoubleCheckSingleton.getInstance();
        DoubleCheckSingleton doubleCheckSingleton1 = DoubleCheckSingleton.getInstance();
        if(doubleCheckSingleton == doubleCheckSingleton1){
            System.out.println("是同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }

    }
}
