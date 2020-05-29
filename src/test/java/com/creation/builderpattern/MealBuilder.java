package com.creation.builderpattern;

import com.creation.builderpattern.drink.ColdDrink;
import com.creation.builderpattern.drink.PepsiDrink;
import com.creation.builderpattern.food.CrispyBurger;
import com.creation.builderpattern.food.OrleansBurger;
import com.creation.builderpattern.food.ZingerBurger;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Author : Ming
 * @Description : 套餐
 * @Date : 2020/5/27
 * @Modify by :
 */
public class MealBuilder extends Meal {

    public void mealOne() {
        super.addBurger(new CrispyBurger());
        super.addDrink(new PepsiDrink());
        super.addBurger(new OrleansBurger());
        List<Map<String, Object>> mealInfo = super.getMealInfo();
        mealInfo.stream().forEach(x ->
                x.forEach((m, n) -> System.out.println(m + ":" + n))
        );
        System.out.println("total：" + super.getMealPrice());
    }

    public void mealTwo() {
        super.addBurger(new ZingerBurger());
        super.addDrink(new ColdDrink());
        super.addDrink(new PepsiDrink());
        super.getMealInfo().stream().forEach(x -> x.forEach((m, n) -> System.out.println(m + ":" + n)));
        System.out.println("total：" + super.getMealPrice());
    }

    @Test
    public void test() {
        System.out.println("套餐一：");
        new MealBuilder().mealOne();
        System.out.println("套餐二：");
        new MealBuilder().mealTwo();
    }
}
