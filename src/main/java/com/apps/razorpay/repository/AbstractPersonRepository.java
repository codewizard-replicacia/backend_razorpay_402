package com.apps.razorpay.repository;


import com.apps.razorpay.model.AbstractPerson;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AbstractPersonRepository extends SimpleJpaRepository<AbstractPerson, String> {
    private final EntityManager em;
    public AbstractPersonRepository(EntityManager em) {
        super(AbstractPerson.class, em);
        this.em = em;
    }
    @Override
    public List<AbstractPerson> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"AbstractPerson\"", AbstractPerson.class).getResultList();
    }
}