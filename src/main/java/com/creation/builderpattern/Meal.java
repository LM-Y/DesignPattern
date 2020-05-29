package com.creation.builderpattern;

import com.creation.builderpattern.drink.Drink;
import com.creation.builderpattern.food.Burger;

import java.util.*;

/**
 * @Author : Ming
 * @Description : 套餐类
 * @Date : 2020/5/27
 * @Modify by :
 */
public class Meal {

    /**
     * 所有饮品
     */
    List<Drink> drinks = new ArrayList<Drink>();

    /**
     * 所有汉堡
     */
    List<Burger> burgers = new ArrayList<Burger>();

    /**
     * 添加饮品
     *
     * @param drink
     */
    public void addDrink(Drink drink) {
        drinks.add(drink);
    }

    /**
     * 删除饮品
     *
     * @param drink
     */
    public void deleteDrink(Drink drink) {
        Iterator<Drink> iterator = drinks.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().name().equals(drink.name())) {
                iterator.remove();
            }
        }
    }

    /**
     * 添加汉堡
     *
     * @param burger
     */
    public void addBurger(Burger burger) {
        burgers.add(burger);
    }

    public double getMealPrice() {
        double totalPrice = 0;
        double drinkPrick = drinks.stream().mapToDouble(Drink::price).sum();
        double burgerPrick = burgers.stream().mapToDouble(Burger::price).sum();
        totalPrice = drinkPrick + burgerPrick;
        return totalPrice;
    }

    public List<Map<String, Object>> getMealInfo() {
        List<Map<String, Object>> mealInfoList = new ArrayList<>();
        burgers.stream().forEach(x -> {
            Map<String, Object> burger = new HashMap<>(burgers.size());
            burger.put("name", x.name());
            burger.put("price", x.price());
            burger.put("packing", x.packing().pack());
            mealInfoList.add(burger);
        });
        drinks.stream().forEach(d -> {
            Map<String, Object> drink = new HashMap<>(drinks.size());
            drink.put("name", d.name());
            drink.put("price", d.price());
            drink.put("packing", d.packing().pack());
            mealInfoList.add(drink);
        });
        return mealInfoList;
    }


}
