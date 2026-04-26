package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Rarity;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class ListRarity {
    private final List<Rarity> rarities;

    public ListRarity() {
        this.rarities = new ArrayList<>();

        this.rarities.add(Rarity.builder()
                .id(1L)
                .name("Común")
                .build());

        this.rarities.add(Rarity.builder()
                .id(2L)
                .name("Poco Común")
                .build());

        this.rarities.add(Rarity.builder()
                .id(1L)
                .name("Raro")
                .build());

        this.rarities.add(Rarity.builder()
                .id(1L)
                .name("Legendario")
                .build());
    }

    public List<Rarity> getRarities() {
        return rarities;
    }

    public Rarity getRarityById(long id) {
        return rarities.stream().filter(
                rarity -> rarity.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
