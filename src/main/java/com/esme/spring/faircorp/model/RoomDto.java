package com.esme.spring.faircorp.model;

import java.util.List;

public class RoomDto {

    private final Long id;
    private final String name;
    private final Integer floor;
    private final Status status;
    private final List<Light> lights;

    public RoomDto(Long id, String name, Integer floor, Status status, List<Light> lights) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.status = status;
        this.lights = lights;
    }

    public RoomDto(Room room) {
        this.id=room.getId();
        this.name=room.getName();
        this.floor=room.getFloor();
        this.status=room.getStatus();
        this.lights=room.getLights();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getFloor() {
        return floor;
    }

    public Status getStatus() {
        return status;
    }

    public List<Light> getLights() {
        return lights;
    }
}
