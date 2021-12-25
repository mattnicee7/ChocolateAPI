package com.github.mattnicee7.resources;

import com.github.mattnicee7.entities.ChocolateBar;
import com.github.mattnicee7.service.ChocolateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/chocolates")
public class ChocolateResource {

    @Autowired
    private ChocolateService chocolateService;

    @GetMapping
    public ResponseEntity<List<ChocolateBar>> findAll() {
        List<ChocolateBar> chocolates = chocolateService.findAll();

        return ResponseEntity.ok().body(chocolates);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ChocolateBar> findById(@PathVariable Long id) {
        ChocolateBar chocolate = chocolateService.findById(id);

        return ResponseEntity.ok().body(chocolate);
    }

}
