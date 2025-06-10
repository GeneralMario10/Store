package com.example.voucherapp.voucherapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.voucherapp.voucherapp.model.Voucher;
import com.example.voucherapp.voucherapp.repo.RoleRepository;
import com.example.voucherapp.voucherapp.repo.UserRepository;
import com.example.voucherapp.voucherapp.repo.VoucherRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/vouchers")
public class VoucherController {
 
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;   
@Autowired
private VoucherRepository voucherRepository;
@PostMapping("/AddVoucher")
public Voucher createVoucher(@RequestBody Voucher voucher) {
    //TODO: process POST request
    
    return voucherRepository.save(voucher) ;
}
@GetMapping("/{code}")
public Voucher getVoucgerByCode(@PathVariable String code) {
    return voucherRepository.findByCode(code);
}
@GetMapping("/GetAll")
public List<Voucher> getAllVouchers() {
    return voucherRepository.findAll();
}




    
}
