package com.creation.builderpattern.packing;

/**
 * @Author : Ming
 * @Description : 纸盒包装
 * @Date : 2020/5/27
 * @Modify by :
 */
public class PaperBox implements Packing {
    @Override
    public String pack() {
        return "Paper Box";
    }

    @Override
    public float price() {
        return 0.3f;
    }
}
