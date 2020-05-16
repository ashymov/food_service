package kg.megacom.food_service.service.impl;

import kg.megacom.food_service.dao.RestaurantRepo;
import kg.megacom.food_service.mapper.RestaurantMapper;
import kg.megacom.food_service.model.dto.RestaurantDto;
import kg.megacom.food_service.model.entity.Restaurant;
import kg.megacom.food_service.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;


    @Override
    public RestaurantDto saveRestaurant(RestaurantDto restaurantDto) {

        Restaurant restaurant=RestaurantMapper.INSTANCE.restaurantToRestaurantDto(restaurantDto);
        restaurant=restaurantRepo.save(restaurant);
        return RestaurantMapper.INSTANCE.restaurantDtoToRestaurant(restaurant);
    }

    @Override
    public Restaurant findById(Long id) {
        Restaurant restaurant=restaurantRepo.findById(id).orElse(null);
        return restaurant;
    }

    @Override
    public List<Restaurant> getAllRestaurant() {

        return restaurantRepo.findAll();
    }

    @Override
    public RestaurantDto editRestaurant(Long id) {

        return null;
    }

    @Override
    public Restaurant deleteRestaurant(Long id) {
        return null;
    }

}
