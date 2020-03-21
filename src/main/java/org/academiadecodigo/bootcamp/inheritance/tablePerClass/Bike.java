package org.academiadecodigo.bootcamp.inheritance.tablePerClass;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bike_table_per_class")
public class Bike extends Transport {
    private Integer gears;

    public Integer getGears() {
        return gears;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }
}
