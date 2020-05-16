package kg.megacom.food_service.service;

import kg.megacom.food_service.model.dto.RestaurantDto;
import kg.megacom.food_service.model.entity.Restaurant;

import java.util.List;

public interface RestaurantService {

    RestaurantDto saveRestaurant(RestaurantDto restaurantDto);
    Restaurant findById(Long id);
    List<Restaurant> getAllRestaurant();
    RestaurantDto editRestaurant(Long id);
    Restaurant deleteRestaurant(Long id);


}
