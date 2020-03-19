package org.academiadecodigo.bootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceExercise");


        EntityManager em = emf.createEntityManager();


        System.out.println("Result: " +
                em.createNativeQuery("select 1 + 1").getSingleResult());


        em.close();


        emf.close();
    }

}
