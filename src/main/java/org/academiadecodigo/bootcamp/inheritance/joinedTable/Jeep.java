package org.academiadecodigo.bootcamp.inheritance.joinedTable;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "JeepJoinedTable")
@Table(name = "jeep_joined_table")
public class Jeep extends Transportation {
    private Integer gears;

    public Integer getGears() {
        return gears;
    }

    public void setGears(Integer gears) {
        this.gears = gears;
    }
}
