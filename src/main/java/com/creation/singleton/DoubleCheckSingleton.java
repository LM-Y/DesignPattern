package com.creation.singleton;

/**
 * @Author : Ming
 * @Description : 如果单例已经存在，那么就不再需要进行同步操作，而是直接返回这个实例，如果没有创建，才会进入同步块，
 * 同步块的目的与之前相同，目的是为了防止有两个调用同时进行时，导致生成多个实例，
 * 有了同步块，每次只能有一个线程调用能访问同步块内容，
 * 当第一个抢到锁的调用获取了实例之后，这个实例就会被创建，之后的所有调用都不会进入同步块，直接在第一重判断就返回了单例
 * @Date : 2020/5/25
 * @Modify by :
 */
public class DoubleCheckSingleton {
    /**
     * 私有变量
     */
    private static volatile DoubleCheckSingleton doubleCheckSingleton = null;

    /**
     * 返回实例
     *
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        //第一次校验
        if (doubleCheckSingleton == null) {
            synchronized (DoubleCheckSingleton.class) {
                //第二次校验
                if (doubleCheckSingleton == null) {
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }

    /**
     * 私有构造方法
     */
    private DoubleCheckSingleton() {
    }
}
