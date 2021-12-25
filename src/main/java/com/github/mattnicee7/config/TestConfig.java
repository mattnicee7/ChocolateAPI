package com.github.mattnicee7.config;

import com.github.mattnicee7.entities.Brand;
import com.github.mattnicee7.entities.ChocolateBar;
import com.github.mattnicee7.entities.enums.ChocolateType;
import com.github.mattnicee7.repositories.BrandRepository;
import com.github.mattnicee7.repositories.ChocolateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // repositories
    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private ChocolateRepository chocolateRepository;

    @Override
    public void run(String... args) throws Exception {
        Brand brand1 = new Brand(null, "Nestle", "Curitiba-PR", 123123123L);
        Brand brand2 = new Brand(null, "Garoto", "Osasco-SP", 1919191919L);

        ChocolateBar chocolate1 = new ChocolateBar(null, brand1, "Crunch", ChocolateType.TO_MILK, 90.0, 400);

        ChocolateBar chocolate2 = new ChocolateBar(null, brand2, "Serenata de Amor", ChocolateType.TO_MILK, 90.0, 317);

        ChocolateBar chocolate3 = new ChocolateBar(null, brand1, "Galak", ChocolateType.BITTER, 100.0, 450);

        ChocolateBar chocolate4 = new ChocolateBar(null, brand2, "Negresco", ChocolateType.TO_MILK, 90.0, 477);

        brand1.getChocolates().add(chocolate1);
        brand1.getChocolates().add(chocolate3);

        brand2.getChocolates().add(chocolate2);
        brand2.getChocolates().add(chocolate4);

        brandRepository.saveAll(Arrays.asList(brand1, brand2));

        chocolateRepository.saveAll(Arrays.asList(chocolate1, chocolate2, chocolate3, chocolate4));


    }

}
