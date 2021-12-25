package com.github.mattnicee7.resources;

import com.github.mattnicee7.entities.Brand;
import com.github.mattnicee7.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/brands")
public class BrandResource {

    @Autowired
    private BrandService brandService;

    @GetMapping
    public ResponseEntity<List<Brand>> findAll() {
        List<Brand> brands = brandService.findAll();

        return ResponseEntity.ok().body(brands);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Brand> findById(@PathVariable Long id) {
        Brand brand = brandService.findById(id);

        return ResponseEntity.ok().body(brand);
    }


}
