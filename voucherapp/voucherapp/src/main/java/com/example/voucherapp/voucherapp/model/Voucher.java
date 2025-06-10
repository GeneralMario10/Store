package com.example.voucherapp.voucherapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Voucher {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY) 
  private long id;
  private double discount;
  private String code;
  private String expire_date;  


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getExpire_date() {
        return this.expire_date;
    }

    public void setExpire_date(String expire_date) {
        this.expire_date = expire_date;
    }


}
