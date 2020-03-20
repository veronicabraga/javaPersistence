package org.academiadecodigo.bootcamp.entity.inheritance.mappedSuperclass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MappedSuperclassBootstrap {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceExercise");

        Customer customer = new Customer();

        customer.setName("Mickey");

        Account account = new Account();

        account.setBalance(500.0);

        AccountService accountService = new AccountService(emf);
        CustomerService customerService = new CustomerService(emf);

        customerService.createCustomer(customer);
        accountService.createAccount(account);

        emf.close();
    }

}
