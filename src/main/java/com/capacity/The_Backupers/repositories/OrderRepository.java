package com.capacity.The_Backupers.repositories;

import com.capacity.The_Backupers.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
