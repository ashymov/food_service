package kg.megacom.food_service.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "dishes")
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dish_id")
    private Long id;

    @Column(length = 100)
    private String name;
    private boolean isActive;
    private float size;
    private String photo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id")
    private Menu menu;

}
