package com.xpressbees.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "delivery_orders")
public class DeliveryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    private String customerName;

    @Column(columnDefinition = "TEXT")
    private String address;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus deliveryStatus;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Default Constructor
    public DeliveryOrder() {
        super();
    }

    // Constructor with Fields
    public DeliveryOrder(String customerName, String address, DeliveryStatus deliveryStatus, LocalDateTime createdAt) {
        this.customerName = customerName;
        this.address = address;
        this.deliveryStatus = deliveryStatus;
        this.createdAt = createdAt;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // toString Method
    @Override
    public String toString() {
        return "DeliveryOrder{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", deliveryStatus=" + deliveryStatus +
                ", createdAt=" + createdAt +
                '}';
    }
}
