package com.capacity.The_Backupers.services;


import com.capacity.The_Backupers.entities.Order;
import com.capacity.The_Backupers.repositories.OrderRepository;
import com.capacity.The_Backupers.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
