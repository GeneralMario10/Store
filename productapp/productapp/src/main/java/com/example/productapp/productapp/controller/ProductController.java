package com.example.productapp.productapp.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.productapp.productapp.dto.Voucher;
import com.example.productapp.productapp.model.Product;
import com.example.productapp.productapp.repo.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/products")
public class ProductController {
 @Autowired
 private ProductRepository repository;
 @Autowired
 private RestTemplate restTemplate;
 //private final String VOUCHER_SERVICE_URL="http://localhost:8081/vouchers/";
 @PostMapping("/AddPRoduct")
 public Product addProduct(@RequestBody Product product) {
     Voucher voucher=restTemplate.getForObject("http://localhost:8081/api/vouchers/" + product.getVoucherCode(), Voucher.class);
     product.setPrice(product.getPrice()*(1-(voucher.getDiscount()/100)));
      //product.setPrice(product.getPrice()-(voucher.getDiscount()*product.getPrice()/100));
     return repository.save(product);

 }
 @GetMapping("/GetAll")
 public List<Product> getAllProducts() {
     return repository.findAll();
 }
 
 @GetMapping("/{name}")
 public Product getByName(@PathVariable String name) {
     return repository.findByName(name);
 }
 
 


}
