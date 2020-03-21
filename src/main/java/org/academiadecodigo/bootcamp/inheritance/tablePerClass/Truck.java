package org.academiadecodigo.bootcamp.inheritance.tablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "truck_table_per_class")
public class Truck extends Transport {


    private Integer engines;

    public Integer getEngines() {
        return engines;
    }

    public void setEngines(Integer engines) {
        this.engines = engines;
    }
}
