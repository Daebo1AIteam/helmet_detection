package com.hayeon.delivery.domain;

import java.util.List;

public interface MenuItemRepository{
    List<MenuItem> findAllbyRestaurantId(Long restaurantId);
}