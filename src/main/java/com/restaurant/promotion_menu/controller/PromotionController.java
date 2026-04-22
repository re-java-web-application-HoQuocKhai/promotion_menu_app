package com.restaurant.promotion_menu.controller;

import com.restaurant.promotion_menu.service.impl.PromotionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/promotions")
public class PromotionController {
    @Autowired
    private PromotionServiceImpl promotionService;

    @GetMapping
    public String getPromotionPage(ModelMap modelmap) {
        modelmap.put("promotions", promotionService.getAll());
        var list = promotionService.getAll();
        System.out.println("Số lượng phần tử lấy được: " + list.size());
        return "promotion/list";
    }
}
