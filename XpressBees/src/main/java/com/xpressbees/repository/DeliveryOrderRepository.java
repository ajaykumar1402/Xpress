package com.xpressbees.repository;

import com.xpressbees.model.DeliveryOrder;
import com.xpressbees.model.DeliveryStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder, Integer> {

    List<DeliveryOrder> findByDeliveryStatus(DeliveryStatus status);

    @Query("SELECT d.customerName, COUNT(d) FROM DeliveryOrder d WHERE d.deliveryStatus = 'DELIVERED' GROUP BY d.customerName ORDER BY COUNT(d) DESC")
    List<Object[]> findTopCustomers();

	List<Object[]> findOrdersByStatusCount();
}
