package kg.megacom.food_service.model.dto;

import lombok.Data;

@Data
public class CustomerDto {

    private Long id;
    private String name;
    private String address;
    private int houseNum;
    private int flatNum;
    private String phone;
}
