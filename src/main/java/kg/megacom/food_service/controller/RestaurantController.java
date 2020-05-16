package kg.megacom.food_service.controller;

import kg.megacom.food_service.model.dto.RestaurantDto;
import kg.megacom.food_service.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;
    @PostMapping("/save")
    public ResponseEntity<?> saveRestaurant(@RequestBody RestaurantDto restaurantDto){
        return ResponseEntity.ok(restaurantService.saveRestaurant(restaurantDto));
    }

}
