package com.esme.spring.faircorp.model;


import javax.persistence.*;

@Entity
public class Light {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(nullable=false)
    private Integer level;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    public Light() {
    }

    public Light(Integer level, Status status) {
        this.level = level;
        this.status = status;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
