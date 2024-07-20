package com.onebyte.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onebyte.modal.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
