package org.academiadecodigo.bootcamp.inheritance.tablePerClass;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassBootstrap {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceExercise");

        Bike bike = new Bike();
        bike.setMaxSpeed(50);
        bike.setGears(3);

        Truck truck = new Truck();
        truck.setMaxSpeed(80);
        truck.setEngines(2);

        TransportService transportService = new TransportService(emf);
        transportService.createBike(bike);
        transportService.createTruck(truck);

        emf.close();
    }
}
