package com.graham;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Team {
    public Team() {}

    public Team(String name, String location, Set<Player> players) {
        this.name = name;
        this.location = location;
        this.players = players;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String location;

    private String mascotte;

    @OneToMany(cascade= CascadeType.ALL)
    @JoinColumn(name="teamId")
    private Set<Player> players;
}
