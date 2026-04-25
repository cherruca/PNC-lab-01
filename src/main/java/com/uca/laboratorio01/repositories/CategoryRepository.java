package com.uca.laboratorio01.repositories;

import com.uca.laboratorio01.common.ListCategory;
import com.uca.laboratorio01.domain.model.Category;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CategoryRepository {
    private final ListCategory listCategory;

    public List<Category> findAll() {
        return listCategory.getCategories();
    }

    public Category findById(long id) {
        return listCategory.getCategoryById(id);
    }
}
