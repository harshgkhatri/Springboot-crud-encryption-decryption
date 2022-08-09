package com.harsh.springboot.user.repository;

import com.harsh.springboot.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User,Long> {
    User findByName(String name);
}
