package com.relationship.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private long roll;
    @Column
    private long fees;
    public Admission(int id, long roll, long fees) {
        this.id = id;
        this.roll = roll;
        this.fees = fees;
    }
    public Admission() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getRoll() {
        return roll;
    }
    public void setRoll(long roll) {
        this.roll = roll;
    }
    public long getFees() {
        return fees;
    }
    public void setFees(long fees) {
        this.fees = fees;
    }
   

}
