package com.esme.spring.faircorp.model;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Light> lights;


    public Room() {}

    public Room(Integer floor,String name, List<Light> lights) {
        this.floor = floor;
        this.name = name;
        this.lights = lights;
    }

    public Long getId() { return id;}

    public String getName() { return name;}

    public Integer getFloor() {return  floor;}

    public Status getStatus() {return status;}

    public List<Light> getLights() {
        return lights;
    }

    public void setStatus(Status status) {this.status=status;}

    public void setFloor(Integer floor) {this.floor=floor;}

    public void setName(String name) {this.name=name;}

    public void setLights(List<Light> lights) {
        this.lights = lights;
    }
}
