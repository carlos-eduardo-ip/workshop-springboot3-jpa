package com.capacity.The_Backupers.repositories;

import com.capacity.The_Backupers.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
