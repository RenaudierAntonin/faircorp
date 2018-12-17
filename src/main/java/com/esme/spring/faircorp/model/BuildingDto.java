package com.esme.spring.faircorp.model;

import java.util.List;

public class BuildingDto {

    private final Long id;
    private final String name;
    private final List<Room> rooms;

    public BuildingDto(Long id, String name, List<Room> rooms) {
        this.id = id;
        this.name = name;
        this.rooms = rooms;
    }

    public BuildingDto(Building building) {
        this.id = building.getId();
        this.name = building.getName();
        this.rooms = building.getRooms();
    }

    public Long getId() { return id;}

    public String getName() { return name;}

    public List<Room> getRooms() {
        return rooms;
    }
}
