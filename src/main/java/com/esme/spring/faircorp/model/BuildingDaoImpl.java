package com.esme.spring.faircorp.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BuildingDaoImpl implements BuildingDaoCustom{

    @PersistenceContext
    public EntityManager em;

    public Building findBuildingById(Long id) {
        String jpql = "Select building from Building building where building.id = :value";
        return (Building) em.createQuery(jpql, Building.class).setParameter("value",id).getResultList();
    }

    public List<Room> GetAllRoomInBuilding(Long id) {
        String jpql = "Select room from Room where room.building_id = :value ";
        return (List<Room>) em.createQuery(jpql, Room.class).setParameter("value",id).getResultList();
    }
}
