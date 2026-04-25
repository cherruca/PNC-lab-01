package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Rarity;

import java.util.ArrayList;
import java.util.List;
public class ListRarity {
    private final List<Rarity> rarities;

    public ListRarity() {
        this.rarities = new ArrayList<>();

        this.rarities.add(Rarity.builder()
                .id(1)
                .name("Común")
                .build());

        this.rarities.add(Rarity.builder()
                .id(2)
                .name("Poco Común")
                .build());

        this.rarities.add(Rarity.builder()
                .id(1)
                .name("Raro")
                .build());

        this.rarities.add(Rarity.builder()
                .id(1)
                .name("Legendario")
                .build());
    }

    public List<Rarity> getRarities() {
        return rarities;
    }
}
