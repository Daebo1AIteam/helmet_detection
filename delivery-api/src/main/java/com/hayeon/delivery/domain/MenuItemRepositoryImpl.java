package com.hayeon.delivery.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MenuItemRepositoryImpl implements MenuItemRepository {
    private List<MenuItem> menuItems = new ArrayList<>();
    @Override
    public List<MenuItem> findAllbyRestaurantId(Long restaurantId) {
        List<MenuItem> menuItems = new ArrayList<>();
        return menuItems;

    }
}
