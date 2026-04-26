package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Category;
import com.uca.laboratorio01.domain.model.Material;
import com.uca.laboratorio01.services.CategoryService;
import com.uca.laboratorio01.services.EffectService;
import com.uca.laboratorio01.services.RarityService;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class ListMaterial {
    private final List<Material> materials;

    public ListMaterial(CategoryService categories, EffectService effectService, RarityService rarityService) {
        this.materials = new ArrayList<>();

        this.materials.add(Material.builder()
                .id(1)
                .name("Ámbar rojo")
                .category(categories.findById(2))
                .price(30)
                .build());

        this.materials.add(Material.builder()
                .id(2)
                .name("Ala de Keese")
                .category(categories.findById(3))
                .price(15)
                .build());

        this.materials.add(Material.builder()
                .id(3)
                .name("Pimienta ardiente")
                .category(categories.findById(4))
                .price(10)
                .build());
    }

}
