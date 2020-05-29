package com.creation.builderpattern.drink;

import com.creation.builderpattern.packing.Bottle;
import com.creation.builderpattern.packing.Packing;

/**
 * @Author : Ming
 * @Description : 冷饮
 * @Date : 2020/5/27
 * @Modify by :
 */
public class ColdDrink implements Drink {
    @Override
    public String name() {
        return "ColdDrink";
    }

    @Override
    public float price() {
        return 4f;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
