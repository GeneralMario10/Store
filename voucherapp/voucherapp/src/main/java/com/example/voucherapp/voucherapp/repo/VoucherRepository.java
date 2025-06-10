package com.example.voucherapp.voucherapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.voucherapp.voucherapp.model.Voucher;

@Repository
public interface VoucherRepository extends JpaRepository<Voucher,Long> {

    public Voucher findByCode(String code);
    
}
