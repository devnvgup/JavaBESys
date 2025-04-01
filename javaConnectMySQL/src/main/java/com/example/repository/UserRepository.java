package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Các phương thức truy vấn tùy chỉnh nếu cần
    public User findByusername(String username);
}