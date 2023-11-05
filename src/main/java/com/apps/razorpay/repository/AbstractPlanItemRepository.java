package com.apps.razorpay.repository;


import com.apps.razorpay.model.AbstractPlanItem;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class AbstractPlanItemRepository extends SimpleJpaRepository<AbstractPlanItem, String> {
    private final EntityManager em;
    public AbstractPlanItemRepository(EntityManager em) {
        super(AbstractPlanItem.class, em);
        this.em = em;
    }
    @Override
    public List<AbstractPlanItem> findAll() {
        return em.createNativeQuery("Select * from \"razorpay\".\"AbstractPlanItem\"", AbstractPlanItem.class).getResultList();
    }
}