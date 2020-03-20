package org.academiadecodigo.bootcamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceExercise");

        UserService userService = new UserService(emf);
        User user = new User();
        //EntityManager em = emf.createEntityManager();

        user.setName("Veronica");
        user.setEmail("vero@academia.com");

        userService.createUser(user);



       // em.close();


        emf.close();
    }

}
