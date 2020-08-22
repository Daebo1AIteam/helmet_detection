package com.hayeon.delivery.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList<>();

    @Override
    public List<Restaurant> findAll() {
    }

    @Override
    public Restaurant findById(Long id){
        Restaurant restaurant = restaurants.stream().filter(r->r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
