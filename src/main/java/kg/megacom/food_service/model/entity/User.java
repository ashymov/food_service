package kg.megacom.food_service.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @Column(length = 100)
    private String name;
    private boolean active;

    @OneToOne
    @JoinColumn(name = "position_id")
    private Position position;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

    private List<Phone> phones;
}
