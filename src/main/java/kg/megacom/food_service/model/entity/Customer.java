package kg.megacom.food_service.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;

    @Column(length = 150,nullable = false)
    private String name;

    @Column(length = 100,nullable = false)
    private String address;

    @Column(name = "house_num")
    private int houseNum;

    @Column(name = "flat_num")
    private int flatNum;

    @Column(length = 20)
    private String phone;
}
