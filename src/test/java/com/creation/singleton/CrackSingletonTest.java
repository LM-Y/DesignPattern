package com.creation.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @Author : Ming
 * @Description : 破解单例
 * @Date : 2020/5/26
 * @Modify by :
 */
public class CrackSingletonTest {

    /**
     * 破坏懒汉模式
     *
     * @throws Exception
     */
    @Test
    public void testLazySingleton() throws Exception {
        /**
         * 获得类对象
         */
        Class<LazySingleton> lazySingletonClass = (Class<LazySingleton>) Class.forName(LazySingleton.class.getName());
        /**
         * 获取构造器
         */
        Constructor<LazySingleton> constructor = lazySingletonClass.getDeclaredConstructor(null);
        /**
         * 跳过检查后，就可以访问无参构造器
         */
        constructor.setAccessible(true);
        LazySingleton lazySingleton = constructor.newInstance();
        LazySingleton lazySingleton1 = constructor.newInstance();
        if (lazySingleton == lazySingleton1) {
            System.out.println("是同一个实例");
        } else {
            System.out.println("不是同一个实例");
        }

    }

    /**
     * 破坏饿汉模式
     */
    @Test
    public void testHungrySingleton() throws Exception{

        Class<HungrySingleton> hungrySingletonClass = (Class<HungrySingleton>) Class.forName(HungrySingleton.class.getName());
        Constructor<HungrySingleton> constructor = hungrySingletonClass.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        HungrySingleton hungrySingleton = constructor.newInstance();
        HungrySingleton hungrySingleton1 = constructor.newInstance();
        if(hungrySingleton == hungrySingleton1){
            System.out.println("是同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }
    }

    /**
     * 破坏双重验证，此方法执行会报错，反射的形式破坏不了
     */
    @Test
    public void testDoubleCheckSingleton() throws Exception{

        Class<DoubleCheckSingleton> doubleCheckSingletonClass = (Class<DoubleCheckSingleton>) Class.forName(DoubleCheckSingleton.class.getName());
        Constructor<DoubleCheckSingleton> constructor = doubleCheckSingletonClass.getDeclaredConstructor();
        DoubleCheckSingleton doubleCheckSingleton = constructor.newInstance();
        DoubleCheckSingleton doubleCheckSingleton1 = constructor.newInstance();
        if(doubleCheckSingleton == doubleCheckSingleton1){
            System.out.println("是同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }
    }

    /**
     * 破坏枚举单例，此方法执行会报错，反射的形式破坏不了
     * @throws Exception
     */
    @Test
    public void testEnumSingleton() throws Exception{

        Class<EnumSingleton> enumSingletonClass = (Class<EnumSingleton>) Class.forName(EnumSingleton.class.getName());
        Constructor<EnumSingleton> constructor = enumSingletonClass.getDeclaredConstructor();
        EnumSingleton enumSingleton = constructor.newInstance();
        EnumSingleton enumSingleton1 = constructor.newInstance();
        if(enumSingleton == enumSingleton1){
            System.out.println("是同一个实例");
        }else{
            System.out.println("不是同一个实例");
        }

    }

}
