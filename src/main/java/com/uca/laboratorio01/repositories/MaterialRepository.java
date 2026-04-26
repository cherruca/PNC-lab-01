package com.uca.laboratorio01.repositories;

import com.uca.laboratorio01.common.ListMaterial;
import com.uca.laboratorio01.domain.model.Material;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MaterialRepository {
    private final ListMaterial listMaterial;

    public List<Material> findAll() {
        return listMaterial.getMaterials();
    }
}
