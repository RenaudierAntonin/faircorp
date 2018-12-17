package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Building {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Room> rooms;

    public Building() {}

    public Building(String name, List<Room> rooms ) {

        this.name  = name;
        this.rooms = rooms;
    }

    public Long getId() {return id;}

    public List<Room> getRooms() {
        return rooms;
    }

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
