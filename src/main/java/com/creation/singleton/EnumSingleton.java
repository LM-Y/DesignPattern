package com.creation.singleton;

/**
 * @Author : Ming
 * @Description : 枚举单例模式
 * @Date : 2020/5/26
 * @Modify by :
 */
public class EnumSingleton {
    /**
     * 私有化构造函数
     */
    private EnumSingleton() {
    }

    /**
     * 定义一个静态枚举类
     */
    enum SingletonEnum {
        /**
         * 创建一个枚举对象，该对象天生为单例
         */
        INSTANCE;
        private EnumSingleton enumSingleton;

        /**
         * 私有化枚举的构造函数
         */
        SingletonEnum() {
            enumSingleton = new EnumSingleton();
        }

        public EnumSingleton getInstnce() {
            return enumSingleton;
        }
    }

    /**
     * 对外暴露一个获取EnumSingleton对象的静态方法
     *
     * @return
     */
    public static EnumSingleton getInstance() {
        return SingletonEnum.INSTANCE.getInstnce();
    }
}
