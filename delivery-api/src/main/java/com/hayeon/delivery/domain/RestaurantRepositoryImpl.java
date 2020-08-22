package com.hayeon.delivery.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl {
    private List<Restaurant> restaurants = new ArrayList<>();

    public List<Restaurant> findAll() {
    }

    public Restaurant findById(Long id){
        Restaurant restaurant = restaurants.stream().filter(r->r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
