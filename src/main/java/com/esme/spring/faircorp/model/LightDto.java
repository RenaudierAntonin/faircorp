package com.esme.spring.faircorp.model;

public class LightDto {

    private final Long id;
    private final Integer level;
    private final Status status;
    private final Long roomid;

    public LightDto(Long id, Integer level, Status status,Long roomid) {
        this.id = id;
        this.level = level;
        this.status = status;
        this.roomid = roomid;
    }

    public LightDto(Light light) {
        this.id = light.getId();
        this.level = light.getLevel();
        this.status = light.getStatus();
        this.roomid = light.getRoom().getId();
    }

    public Long getId() {
        return id;
    }

    public Integer getLevel() {
        return level;
    }

    public Status getStatus() {
        return status;
    }

    public Long getRoomId() {
        return roomid;
    }
}
