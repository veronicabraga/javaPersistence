package org.academiadecodigo.bootcamp.inheritance.joinedTable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "BusJoinedTable")
@Table(name = "bus_joined_table")
public class Bus extends Transportation {
    private Integer engines;

    public Integer getEngines() {
        return engines;
    }

    public void setEngines(Integer engines) {
        this.engines = engines;
    }
}
