package com.capacity.The_Backupers.repositories;

import com.capacity.The_Backupers.entities.Category;
import com.capacity.The_Backupers.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
