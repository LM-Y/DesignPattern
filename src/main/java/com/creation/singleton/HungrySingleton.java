package com.creation.singleton;

/**
 * @Author : Ming
 * @Description : 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * @Date : 2020/5/25
 * @Modify by :
 */
public class HungrySingleton {
    /**
     * 此处定义类变量实例并直接实例化，在类加载的时候就完成了实例化并保存在类中
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * private 避免类在外部被实例化
     * 定义私有构造器，表示只在类内部使用，亦指单例的实例只能在单例类内部创建
     */
    private HungrySingleton() {
    }

    /**
     * 义一个公共的公开的方法来返回该类的实例,
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
