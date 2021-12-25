package com.github.mattnicee7.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.mattnicee7.entities.enums.ChocolateType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ChocolateBar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "brand_id")
    // Many = Chocolate
    // One = Brand
    // Um chocolate tem uma marca
    private Brand brand;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Enumerated(EnumType.STRING)
    private ChocolateType chocolateType;

    @Getter
    @Setter
    private Double weight;

    @Getter
    @Setter
    private Integer calories;

}
