package org.academiadecodigo.bootcamp.inheritance.mappedSuperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;

public class AccountService {

    private EntityManagerFactory emf;

    public AccountService(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public void createAccount(Account account) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(account);
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
