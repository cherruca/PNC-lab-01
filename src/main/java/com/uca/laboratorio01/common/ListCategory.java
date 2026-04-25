package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Category;
import java.util.ArrayList;
import java.util.List;

public class ListCategory {
    private final List<Category> categories;

    public ListCategory() {
        this.categories = new ArrayList<>();

        this.categories.add(Category.builder()
                .id(1)
                .name("Comida")
                .build());

        this.categories.add(Category.builder()
                .id(2)
                .name("Mineral")
                .build());

        this.categories.add(Category.builder()
                .id(3)
                .name("Parte de Monstruo")
                .build());

        this.categories.add(Category.builder()
                .id(4)
                .name("Planta")
                .build());
    }

    public List<Category> getCategories() {
        return categories;
    }

    public Category getCategoryById(long id) {
        Category category1 = categories.stream()
                .filter(category -> category.getId().equals(id))
                .findFirst().orElse(null);
        return category1;
    }
}
