package com.creation.builderpattern.food;

import com.creation.builderpattern.packing.Packing;
import com.creation.builderpattern.packing.PaperBox;

/**
 * @Author : Ming
 * @Description : 奥尔良鸡腿堡
 * @Date : 2020/5/27
 * @Modify by :
 */
public class OrleansBurger implements Burger {

    @Override
    public String name() {
        return "OrleansBurger";
    }

    @Override
    public float price() {
        return 11;
    }

    @Override
    public Packing packing() {
        return new PaperBox();
    }
}
