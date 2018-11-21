package com.esme.spring.faircorp.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BuildingDaoImpl implements BuildingDaoCustom{

    @PersistenceContext
    public EntityManager em;

    public Building findBuildingById(Long id) {
        String jpql = "Select building from Building building where building.id = :value";
        return (Building) em.createQuery(jpql, Building.class).setParameter("value",id).getResultList();
    }
}
