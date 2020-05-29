package com.creation.builderpattern.packing;

/**
 * @Author : Ming
 * @Description : 瓶装
 * @Date : 2020/5/27
 * @Modify by :
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }

    @Override
    public float price() {
        return 0.3f;
    }
}
