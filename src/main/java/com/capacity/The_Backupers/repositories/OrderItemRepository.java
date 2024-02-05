package com.capacity.The_Backupers.repositories;

import com.capacity.The_Backupers.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
