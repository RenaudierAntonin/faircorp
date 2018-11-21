package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable=false, length=255)
    private String name;

    @Column(nullable=false)
    private Integer floor;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToMany(mappedBy = "room")
    private Set<Light> light;

    @ManyToOne
    private Building building;

    public Room() {}

    public Room(Integer floor,String name) {
        this.floor = floor;
        this.name = name;
    }

    public Long getId() { return id;}

    public String getName() { return name;}

    public Integer getFloor() {return  floor;}

    public Status getStatus() {return status;}

    public Building getBuilding() {return building;}

    public void setStatus(Status status) {this.status=status;}

    public void setFloor(Integer floor) {this.floor=floor;}

    public void setName(String name) {this.name=name;}
}
