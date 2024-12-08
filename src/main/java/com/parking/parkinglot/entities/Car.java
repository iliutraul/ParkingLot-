package com.parking.parkinglot.entities;

import jakarta.persistence.*;

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


    private String LicensePlate;
    public String getLicensePlate() {
        return LicensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }
    private String ParkingLot;
    public String getParkingLot() {
        return ParkingLot;
    }
    public void setParkingLot(String parkingLot) {
        ParkingLot = parkingLot;
    }

}