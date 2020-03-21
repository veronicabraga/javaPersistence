package org.academiadecodigo.bootcamp.inheritance.joinedTable;


import javax.persistence.*;

@Entity(name = "TransportationJoinedTable")
@Table(name = "transportation_joined_table")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Transportation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer maxSpeed;

    public Integer getId() {
        return id;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

