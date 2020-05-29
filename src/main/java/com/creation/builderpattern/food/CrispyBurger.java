package com.creation.builderpattern.food;

import com.creation.builderpattern.packing.Packing;
import com.creation.builderpattern.packing.PaperBox;

/**
 * @Author : Ming
 * @Description : 劲脆鸡腿堡
 * @Date : 2020/5/27
 * @Modify by :
 */
public class CrispyBurger implements Burger {
    @Override
    public String name() {
        return "CrispyBurger";
    }

    @Override
    public float price() {
        return 16.5f;
    }

    @Override
    public Packing packing() {
        return new PaperBox();
    }
}
