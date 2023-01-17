package com.educandoweb.couse.services;

import com.educandoweb.couse.entities.Category;
import com.educandoweb.couse.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findbyId(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }

}

