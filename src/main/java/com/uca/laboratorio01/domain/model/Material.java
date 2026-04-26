package com.uca.laboratorio01.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material {
    private long id;
    private String name;
    private Category category;
    private Effect effect;
    private Double price;
    private String location;
    private Rarity rarity;
}
