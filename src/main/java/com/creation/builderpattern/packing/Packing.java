package com.creation.builderpattern.packing;

/**
 * @Author : Ming
 * @Description : 包装接口
 * @Date : 2020/5/27
 * @Modify by :
 */
public interface Packing {
    /**
     * 包装名称
     * @return
     */
    String pack();

    /**
     * 包装成本
     * @return
     */
    float price();
}
