package com.github.mattnicee7.repositories;

import com.github.mattnicee7.entities.ChocolateBar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChocolateRepository extends JpaRepository<ChocolateBar, Long> {
}
