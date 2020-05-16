package kg.megacom.food_service.model.dto;

import lombok.Data;

@Data
public class RestaurantDto {
    private Long id;
    private String name;
    private boolean isActive;
}
