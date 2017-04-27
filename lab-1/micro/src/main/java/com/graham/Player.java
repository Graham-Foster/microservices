package com.graham;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Player {

    public Player(){}
    public Player(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String position;
}
