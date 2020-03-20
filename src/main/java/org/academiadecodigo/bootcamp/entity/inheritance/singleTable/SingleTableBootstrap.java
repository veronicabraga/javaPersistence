package org.academiadecodigo.bootcamp.entity.inheritance.singleTable;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableBootstrap {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceExercise");

        Car car = new Car();
        car.setGears(5);
        car.setMaxSpeed(100);

        Boat boat = new Boat();
        boat.setEngines(1);
        boat.setMaxSpeed(200);

        VehicleService vehicleService = new VehicleService(emf);
        vehicleService.createCar(car);
        vehicleService.createBoat(boat);

        emf.close();

    }


}
