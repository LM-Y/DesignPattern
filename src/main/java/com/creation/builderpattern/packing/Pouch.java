package com.creation.builderpattern.packing;

/**
 * @Author : Ming
 * @Description : 袋装
 * @Date : 2020/5/27
 * @Modify by :
 */
public class Pouch implements Packing {

    @Override
    public String pack() {
        return "Pouch";
    }

    @Override
    public float price() {
        return 0.1f;
    }
}
