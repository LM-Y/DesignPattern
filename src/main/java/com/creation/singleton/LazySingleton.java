package com.creation.singleton;

/**
 * @Author : Ming
 * @Description : 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
 * 注意：如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，
 * 否则将存在线程非安全的问题。如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 * @Date : 2020/5/25
 * @Modify by :
 */
public class LazySingleton {
    /**
     * 保证 instance 在所有线程中同步
     * 定义一个私有类变量来存放单例，私有的目的是指外部无法直接获取这个变量，而要使用提供的公共方法来获取
     */
    private static volatile LazySingleton instance = null;

    /**
     * private 避免类在外部被实例化
     * 定义私有构造器，表示只在类内部使用，亦指单例的实例只能在单例类内部创建
     */
    private LazySingleton() {
    }

    /**
     * 定义一个公共的公开的方法来返回该类的实例，由于是懒汉式，需要在第一次使用时生成实例，所以为了线程安全，使用synchronized关键字来确保只会生成单例
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        //多个线程判断instance都为null时，在执行new操作时多线程会出现重复情况
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
