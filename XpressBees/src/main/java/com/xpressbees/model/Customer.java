package com.xpressbees.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String name;

    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<DeliveryOrder> orders;

    // Default Constructor
    public Customer() {
        super();
    }

    // Constructor with Fields
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public List<DeliveryOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<DeliveryOrder> orders) {
        this.orders = orders;
    }

    // toString Method
    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
