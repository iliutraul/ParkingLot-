package com.parking.parkinglot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @Size(min = 1, max = 20)
    @Column(unique = true,nullable = false,length = 20)
    private String parkingLot;

    @Size(min = 3, max = 8)
    @Column(unique = true,nullable = false,length = 20)
    private String LicensePlate;

    private CarPhoto photo;
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

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public CarPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(CarPhoto photo) {
        this.photo = photo;
    }
}