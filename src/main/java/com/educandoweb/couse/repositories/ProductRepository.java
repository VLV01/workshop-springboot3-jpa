package com.educandoweb.couse.repositories;

import com.educandoweb.couse.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>  {


}
