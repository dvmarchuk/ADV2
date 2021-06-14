package com.example.adv2.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String name;


//    @OneToOne
//    private Todo todo;

    public User(String name) {
        this.name = name;
    }
}
