package com.example.voucherapp.voucherapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    private final UserDetailsService userDetailsService;

    public SecurityConfig(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        
        http
.csrf().disable()
.authorizeHttpRequests()
    .requestMatchers("/api/vouchers/AddVoucher").hasRole("ADMIN")  // فقط الأدمين يستطيع إضافة الـ Vouchers
    .requestMatchers("/api/vouchers/GetAll").hasAnyRole("ADMIN", "USER")  // باقي العمليات مسموحة للأدمن واليوزر
    .anyRequest().authenticated()  // باقي الطلبات تتطلب توثيق
.and()
.formLogin().permitAll()  // يسمح بتسجيل الدخول عبر الفورم
.and()
.httpBasic();  // تف
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

//http
//.csrf().disable()
//.authorizeHttpRequests()
//    .requestMatchers("/api/vouchers/AddVoucher").hasRole("ADMIN")  // فقط الأدمين يستطيع إضافة الـ Vouchers
//    .requestMatchers("/api/vouchers/GetAll").hasAnyRole("ADMIN", "USER")  // باقي العمليات مسموحة للأدمن واليوزر
//    .anyRequest().authenticated()  // باقي الطلبات تتطلب توثيق
//.and()
//.formLogin().permitAll()  // يسمح بتسجيل الدخول عبر الفورم
//.and()
//.httpBasic();  // تفعيل الـ Basic Authentication إذا كنت بحاجة إليه
//return http.build();