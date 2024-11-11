package com.parking.lab4parkinglot.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    private User owner;
    public User getOwner() {
        return owner;
    };
    public void setOwner(User owner) {this.owner = owner;};

}