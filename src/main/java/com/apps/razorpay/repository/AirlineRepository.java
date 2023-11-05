package com.apps.razorpay.repository;


import com.apps.razorpay.model.Airline;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AirlineRepository extends SimpleJpaRepository<Airline, String> {
    private final EntityManager em;
    public AirlineRepository(EntityManager em) {
        super(Airline.class, em);
        this.em = em;
    }
    @Override
    public List<Airline> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"Airline\"", Airline.class).getResultList();
    }
}