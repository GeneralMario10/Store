package com.example.productapp.productapp.dto;

public class Voucher {
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
