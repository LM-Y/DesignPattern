package com.creation.builderpattern.drink;

import com.creation.builderpattern.packing.Packing;

/**
 * @Author : Ming
 * @Description : 饮品接口：冷饮、可口可乐、百事
 * @Date : 2020/5/27
 * @Modify by :
 */
public interface Drink {

    /**
     * 名称
     * @return String
     */
    String name();

    /**
     * 价格
     * @return
     */
    float price();

    /**
     *  包装
     * @return
     */
    Packing packing();
}
