package com.creation.builderpattern.food;

import com.creation.builderpattern.packing.Packing;

/**
 * @Author : Ming
 * @Description : 汉堡接口，汉堡：香辣鸡腿堡、奥尔良鸡腿堡、劲脆鸡腿堡；
 * @Date : 2020/5/27
 * @Modify by :
 */
public interface Burger {
    /**
     * 汉堡名称
     * @return
     */
    String name();

    /**
     * 汉堡价格
     * @return
     */
    float price();

    /**
     * 包装：纸盒、袋装、瓶装
     * @return
     */
    Packing packing();
}
