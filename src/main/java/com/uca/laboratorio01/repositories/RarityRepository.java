package com.uca.laboratorio01.repositories;

import com.uca.laboratorio01.common.ListRarity;
import com.uca.laboratorio01.domain.model.Rarity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class RarityRepository {
    private final ListRarity listRarity;

    public List<Rarity> findAll() {
        return listRarity.getRarities();
    }

    public Rarity getRarityById(long id) {
        return listRarity.getRarityById(id);
    }
}
