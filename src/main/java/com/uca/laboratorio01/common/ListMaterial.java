package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Category;
import com.uca.laboratorio01.domain.model.Material;
import com.uca.laboratorio01.services.CategoryService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListMaterial {
    private final List<Material> materials;
    private CategoryService categories;

    public ListMaterial(CategoryService categories) {
        this.categories = categories;
        this.materials = new ArrayList<>();

        this.materials.add(Material.builder()
                .id(1)
                .name("Ámbar rojo")
                .category(categories.findById(2))
                .price(30)
                .build());

    }


}
