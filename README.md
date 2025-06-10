# Product & Voucher Integration

## 🧾 Overview
This project integrates two Spring Boot applications:
- **Product Management System**: Manages products with full CRUD operations.
- **Voucher System**: Provides discount codes that can be applied to products via REST API.

This project integrates two Spring Boot applications:
- **Product Management System**: Manages products with full CRUD operations.
- **Voucher System**: Provides discount codes that can be applied to products via REST API.

The integration between the two services is handled using Spring's `RestTemplate`, specifically with the `getForObject()` method to fetch voucher details from the Voucher Service and apply them to products.

The systems communicate through RESTful APIs, allowing vouchers to be applied directly to product prices.

---

## 💻 Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Spring Security (JWT Authentication)
- RESTful APIs
- Maven

---

## 🛠️ Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/your-repo-name.git
cd your-repo-name

