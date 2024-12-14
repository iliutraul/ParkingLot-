package com.parking.parkinglot.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String parkingLot;
    private String LicensePlate;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    public User getOwner() {
        return owner;
    };

    public void setOwner(User owner) {
        this.owner = owner;};


    public String getLicensePlate() {
        return LicensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }


    public String getParkingLot() {
        return parkingLot;
    }
    public void setParkingLot(String parkingLot) {
        this.parkingLot = parkingLot;
    }

    public void setParkingSpot(String parkingSpot) {
        this.parkingLot = parkingSpot;
    }
}