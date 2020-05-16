package kg.megacom.food_service.mapper;

import kg.megacom.food_service.model.dto.RestaurantDto;
import kg.megacom.food_service.model.entity.Restaurant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RestaurantMapper {
    RestaurantMapper INSTANCE= Mappers.getMapper(RestaurantMapper.class);

    RestaurantDto restaurantDtoToRestaurant(Restaurant restaurant);
    Restaurant restaurantToRestaurantDto(RestaurantDto restaurantDto);


}
