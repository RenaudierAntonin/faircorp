package com.esme.spring.faircorp.model;

public class RoomDto {

    private final Long id;
    private final String name;
    private final Integer floor;
    private final Status status;
    private final Long buildingid;

    public RoomDto(Long id, String name, Integer floor, Status status, Long buildingid) {
        this.id = id;
        this.name = name;
        this.floor = floor;
        this.status = status;
        this.buildingid = buildingid;
    }

    public RoomDto(Room room) {
        this.id=room.getId();
        this.name=room.getName();
        this.floor=room.getFloor();
        this.status=room.getStatus();
        this.buildingid=room.getBuilding().getId();
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

    public Long getBuildingid() {
        return buildingid;
    }
}
