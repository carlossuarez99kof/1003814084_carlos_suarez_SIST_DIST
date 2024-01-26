package com.parcial.parcial.src.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Customer_1003814084")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String name;

    @Column(name = "correo", length = 50, nullable = false)
    private String email;

    @Column(name = "telefono", length = 20, nullable = false)
    private String phone;

    @Column(name = "direccion", length = 100, nullable = false)
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

