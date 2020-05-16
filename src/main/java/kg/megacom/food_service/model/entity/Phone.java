package kg.megacom.food_service.model.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phone_id")
    private Long id;

    @Column(length = 20)
    private String phone;

    private boolean active;
}
