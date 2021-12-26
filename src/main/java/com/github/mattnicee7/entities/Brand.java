package com.github.mattnicee7.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private Long phone;

    @Getter
    @Setter
    @JsonIgnore
    @OneToMany(mappedBy = "brand")
    private Set<ChocolateBar> chocolates = new HashSet<>();

    public Brand(Long id, String name, String address, Long phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

}
