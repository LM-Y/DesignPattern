package com.creation.builderpattern.drink;

import com.creation.builderpattern.packing.Bottle;
import com.creation.builderpattern.packing.Packing;

/**
 * @Author : Ming
 * @Description : 可口可乐
 * @Date : 2020/5/27
 * @Modify by :
 */
public class CokeDrink implements Drink {
    @Override
    public String name() {
        return "CokeDrink";
    }

    @Override
    public float price() {
        return 4.5f;
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
