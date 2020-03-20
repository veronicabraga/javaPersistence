package org.academiadecodigo.bootcamp.entity.inheritance.singleTable;

import org.academiadecodigo.bootcamp.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class VehicleService {

    private EntityManagerFactory emf;

    public VehicleService(EntityManagerFactory emf) {
        this.emf = emf;
    }


    public void createCar(Car car) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(car);
            em.getTransaction().commit();

        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    public void createBoat(Boat boat) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(boat);
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
