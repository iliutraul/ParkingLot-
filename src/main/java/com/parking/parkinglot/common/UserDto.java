package com.parking.parkinglot.common;

public class UserDto {
    Long id;
    String userEmail;
    String userName;

    public UserDto(Long id, String userEmail, String userName) {
        this.id = id;
        this.userEmail = userEmail;
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public Long getId() {
        return id;
    }
}
