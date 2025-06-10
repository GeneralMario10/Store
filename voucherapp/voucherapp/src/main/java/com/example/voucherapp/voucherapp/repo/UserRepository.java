package com.example.voucherapp.voucherapp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voucherapp.voucherapp.model.User;



@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
    public Optional<User> findByEmail(String email);
}
