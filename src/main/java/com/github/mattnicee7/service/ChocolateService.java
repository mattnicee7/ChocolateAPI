package com.github.mattnicee7.service;

import com.github.mattnicee7.entities.ChocolateBar;
import com.github.mattnicee7.repositories.ChocolateRepository;
import com.github.mattnicee7.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ChocolateService {

    @Autowired
    private ChocolateRepository chocolateRepository;

    public List<ChocolateBar> findAll() {
        return chocolateRepository.findAll();
    }

    public ChocolateBar findById(Long id) {
        Optional<ChocolateBar> chocolate = chocolateRepository.findById(id);

        return chocolate.orElseThrow(() -> new ResourceNotFoundException(id));
    }

}
