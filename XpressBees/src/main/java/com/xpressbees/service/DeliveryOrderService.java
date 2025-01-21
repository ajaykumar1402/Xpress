package com.xpressbees.service;

import com.xpressbees.model.DeliveryOrder;
import com.xpressbees.model.DeliveryStatus;

import java.util.List;

public interface DeliveryOrderService {
    DeliveryOrder addOrder(DeliveryOrder order);
    List<DeliveryOrder> getOrdersByStatus(DeliveryStatus status);
    List<Object[]> getTopCustomers();
	List<Object[]> getOrdersByStatusCount();
}
