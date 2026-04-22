package com.restaurant.promotion_menu.repository;

import com.restaurant.promotion_menu.model.Dish;

import java.util.List;

public interface PromotionRepository {
    List<Dish> findAll();
}
