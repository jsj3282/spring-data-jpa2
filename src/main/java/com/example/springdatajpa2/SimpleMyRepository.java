package com.example.springdatajpa2;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import java.io.Serializable;

public class SimpleMyRepository<T, Id extends Serializable> extends QuerydslJpaRepository<T, Id> implements MyRepository<T, Id> { //extends SimpleJpaRepository<T, Id> implements MyRepository<T, Id> {

    private EntityManager entityManager;

    public SimpleMyRepository(JpaEntityInformation<T, Id> entityInformation, EntityManager entityManager) {
        super(entityInformation, entityManager);
        this.entityManager = entityManager;
    }

//    public SimpleMyRepository(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
//        super(entityInformation, entityManager);
//        this.entityManager = entityManager;
//    }

    @Override
    public boolean contains(T entity) {
        return entityManager.contains(entity);
    }
}
