package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Category;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListCategory {
    private final List<Category> categories;

    public ListCategory() {
        this.categories = new ArrayList<>();

        this.categories.add(Category.builder()
                .id(1L)
                .name("Comida")
                .build());

        this.categories.add(Category.builder()
                .id(2L)
                .name("Mineral")
                .build());

        this.categories.add(Category.builder()
                .id(3L)
                .name("Parte de Monstruo")
                .build());

        this.categories.add(Category.builder()
                .id(4L)
                .name("Planta")
                .build());
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Category getCategoryById(long id) {
        return categories.stream().filter(category -> category.getId()
                .equals(id))
                .findFirst()
                .orElse(null);
    }
}
