package org.academiadecodigo.bootcamp.inheritance.joinedTable;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JoinedTableBootstrap {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceExercise");

        Bus bus = new Bus();
        bus.setEngines(2);

        Jeep jeep = new Jeep();
        jeep.setGears(5);

        TransportationService transportationService = new TransportationService(emf);
        transportationService.createBus(bus);
        transportationService.createJeep(jeep);

        emf.close();
    }
}
