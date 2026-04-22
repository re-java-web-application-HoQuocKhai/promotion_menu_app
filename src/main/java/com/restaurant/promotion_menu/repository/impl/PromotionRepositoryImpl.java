package com.restaurant.promotion_menu.repository.impl;

import com.restaurant.promotion_menu.model.Dish;
import com.restaurant.promotion_menu.repository.PromotionRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PromotionRepositoryImpl implements PromotionRepository {
    private final List<Dish> dishes;

    public PromotionRepositoryImpl() {
        dishes = new ArrayList<>();
        dishes.add(new Dish(1, "Pizza", 100, 50));
        dishes.add(new Dish(2, "Hamburger", 50, 20));
        dishes.add(new Dish(3, "Spaghetti", 80, 40));
    }

    @Override
    public List<Dish> findAll() {
        return dishes;
    }
}
