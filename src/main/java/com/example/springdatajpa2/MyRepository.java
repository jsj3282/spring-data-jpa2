package com.example.springdatajpa2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Id;
import java.io.Serializable;

@NoRepositoryBean
public interface MyRepository<T, Id extends Serializable> extends JpaRepository<T, Id> {

    boolean contains(T entity);
}
