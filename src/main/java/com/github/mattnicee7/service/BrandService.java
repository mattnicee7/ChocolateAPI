package com.github.mattnicee7.service;

import com.github.mattnicee7.entities.Brand;
import com.github.mattnicee7.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Brand findById(Long id) {
        Optional<Brand> brand = brandRepository.findById(id);

        return brand.get();
    }

}
