package com.phanNgocNam.activeMQDemo.repositories;

import com.phanNgocNam.activeMQDemo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
