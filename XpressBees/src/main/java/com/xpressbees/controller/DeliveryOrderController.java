package com.xpressbees.controller;

import com.xpressbees.model.DeliveryOrder;
import com.xpressbees.model.DeliveryStatus;
import com.xpressbees.service.DeliveryOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class DeliveryOrderController {

    private final DeliveryOrderService service;

    public DeliveryOrderController(DeliveryOrderService service) {
        this.service = service;
    }

    @PostMapping
    public DeliveryOrder addOrder(@RequestBody DeliveryOrder order) {
        return service.addOrder(order);
    }

    @GetMapping
    public List<DeliveryOrder> getOrdersByStatus(@RequestParam DeliveryStatus status) {
        return service.getOrdersByStatus(status);
    }

    @GetMapping("/top-customers")
    public List<Object[]> getTopCustomers() {
        return service.getTopCustomers();
    }
    
    @GetMapping("/status-count")
    public List<Object[]> getOrdersByStatusCount(@RequestParam DeliveryStatus status){
    	return service.getOrdersByStatusCount();
    }
}
