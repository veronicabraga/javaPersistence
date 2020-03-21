package org.academiadecodigo.bootcamp.inheritance.joinedTable;

import org.academiadecodigo.bootcamp.inheritance.tablePerClass.Bike;
import org.academiadecodigo.bootcamp.inheritance.tablePerClass.Truck;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class TransportationService {

    private EntityManagerFactory emf;

    public TransportationService(EntityManagerFactory emf) {
        this.emf = emf;
    }


    public void createBus(Bus bus) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(bus);
            em.getTransaction().commit();

        } catch (RollbackException ex) {
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

    public void createJeep(Jeep jeep) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(jeep);
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
