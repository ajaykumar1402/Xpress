package com.xpressbees.service.impl;

import com.xpressbees.model.DeliveryOrder;
import com.xpressbees.model.DeliveryStatus;
import com.xpressbees.repository.DeliveryOrderRepository;
import com.xpressbees.service.DeliveryOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryOrderServiceImpl implements DeliveryOrderService {

    private final DeliveryOrderRepository repository;

    public DeliveryOrderServiceImpl(DeliveryOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public DeliveryOrder addOrder(DeliveryOrder order) {
        return repository.save(order);
    }

    @Override
    public List<DeliveryOrder> getOrdersByStatus(DeliveryStatus status) {
        return repository.findByDeliveryStatus(status);
    }

    @Override
    public List<Object[]> getTopCustomers() {
        return repository.findTopCustomers();
    }

	@Override
	public List<Object[]> getOrdersByStatusCount() {
		return repository.findOrdersByStatusCount();
	}

}
