package com.parking.parkinglot.common;

import com.parking.parkinglot.entities.User;

public class CarDto {
    Long id;
    String licensePlate;
    String parkingLot;
    String ownerName;

    public CarDto(Long id, User owner, String licensePlate, String parkingLot, String ownerName) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.parkingLot = parkingLot;
        this.ownerName = ownerName;
    }



    public Long getId() {
        return id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public String getParkingLot() {
        return parkingLot;
    }
}
