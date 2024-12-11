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
    @JoinColumn(name = "owner_id",nullable = false)
    private User owner;
    public User getOwner() {
        return owner;
    };

    public void setOwner(User owner) {
        this.owner = owner;};

@Column(name="license_plate")
    private String LicensePlate;
    public String getLicensePlate() {
        return LicensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }
    @Column(name="Parking_lot")
    private String parkingLot;
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