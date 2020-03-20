package org.academiadecodigo.bootcamp.entity.inheritance.mappedSuperclass;

import org.academiadecodigo.bootcamp.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class CustomerService {

    private EntityManagerFactory emf;

    public CustomerService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void createCustomer(Customer customer) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();

        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

}
