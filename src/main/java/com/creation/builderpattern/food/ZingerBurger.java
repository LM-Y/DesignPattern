package com.creation.builderpattern.food;

import com.creation.builderpattern.packing.Packing;
import com.creation.builderpattern.packing.PaperBox;

/**
 * @Author : Ming
 * @Description : 香辣鸡腿堡
 * @Date : 2020/5/27
 * @Modify by :
 */
public class ZingerBurger implements Burger {

    @Override
    public String name() {
        return "ZingerBurger";
    }

    @Override
    public float price() {
        return 10.88f;
    }

    @Override
    public Packing packing() {
        return new PaperBox();
    }

}
