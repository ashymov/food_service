package kg.megacom.food_service.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id")
    private Long id;


    @Column(length = 50)
    private String login;
    @Column(length = 50)
    private String password;
}
