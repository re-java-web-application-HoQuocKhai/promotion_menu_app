package com.restaurant.promotion_menu.service.impl;

import com.restaurant.promotion_menu.model.Dish;
import com.restaurant.promotion_menu.repository.PromotionRepository;
import com.restaurant.promotion_menu.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public List<Dish> getAll() {
        return promotionRepository.findAll();
    }
}
