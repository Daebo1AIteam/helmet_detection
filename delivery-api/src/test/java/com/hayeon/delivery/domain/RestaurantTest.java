package com.hayeon.delivery.domain;

import org.assertj.core.internal.bytebuddy.matcher.ElementMatcher;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

class RestaurantTest {
    
    @Test
    public void create(){
        Restaurant restaurant = new Restaurant("Hayeon","Seoul");
        assertThat(restaurant.getName(),is("Hayeon"));
                
    }
    @Test
    public void getInfo(){
        Restaurant restaurant = new Restaurant("Hayeon","Seoul");
        assertThat(restaurant.getInfo(), is("Hayeon in Seoul"));
    }
    
    private void assertThat(String name, ElementMatcher.Junction<Object> hayeon) {
    }

}