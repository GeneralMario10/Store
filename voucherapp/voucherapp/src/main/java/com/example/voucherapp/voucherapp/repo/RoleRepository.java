package com.example.voucherapp.voucherapp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.voucherapp.voucherapp.model.Role;



public interface RoleRepository extends JpaRepository<Role,Long> {
    
public Optional<Role> findByName(String name);
}
