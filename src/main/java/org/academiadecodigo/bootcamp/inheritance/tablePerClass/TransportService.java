package org.academiadecodigo.bootcamp.inheritance.tablePerClass;

import org.academiadecodigo.bootcamp.inheritance.singleTable.Boat;
import org.academiadecodigo.bootcamp.inheritance.singleTable.Car;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class TransportService {

    private EntityManagerFactory emf;

    public TransportService(EntityManagerFactory emf) {
        this.emf = emf;
    }


    public void createBike(Bike bike) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(bike);
            em.getTransaction().commit();

        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    public void createTruck(Truck truck) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(truck);
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
