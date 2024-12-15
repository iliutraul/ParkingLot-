package com.parking.parkinglot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "username", unique = true, nullable = false,length = 20)
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;
    private String password;

    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
@Email
@Column(unique = true, nullable = false,length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}