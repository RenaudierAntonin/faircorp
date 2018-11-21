package com.esme.spring.faircorp.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RoomDaoImpl implements RoomDaoCustom {

    @PersistenceContext
    public EntityManager em;

    @Override
    public Room FindRoomByName(String name) {
        String jpql = "Select room from Room room where room.name = :value";
        return (Room) em.createQuery(jpql, Room.class).setParameter("value",name).getResultList();
    }

    public Room FindRoomById(Long id) {
        String jpql = "Select room from Room room where room.id = :value";
        return (Room) em.createQuery(jpql, Room.class).setParameter("value",id).getResultList();
    }

    public List<Room> FindRoomByBuilding(Building building) {
        String jpql = "Select room from Room room where room.building = :value";
        return em.createQuery(jpql, Room.class).setParameter("value",building).getResultList();
    }
}
