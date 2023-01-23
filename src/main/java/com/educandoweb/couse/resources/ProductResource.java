package com.educandoweb.couse.resources;

import com.educandoweb.couse.entities.Product;
import com.educandoweb.couse.entities.User;
import com.educandoweb.couse.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

     @GetMapping
     public ResponseEntity<List<Product>> findAll() {
         List<Product> list = service.findAll();
         return ResponseEntity.ok().body(list);
     }

     @GetMapping(value = "/{id}")
     public ResponseEntity<Product> findById(@PathVariable Long id) {
         Product obj = service.findbyId(id);
         return ResponseEntity.ok().body(obj);
     }
}
