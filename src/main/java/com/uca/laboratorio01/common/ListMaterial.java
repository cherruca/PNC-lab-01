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

    public ListMaterial(CategoryService categories, EffectService effects, RarityService rarities) {
        this.materials = new ArrayList<>();

        this.materials.add(Material.builder()
                .id(1)
                .name("Ámbar rojo")
                .category(categories.findById(2))
                .price(30.0)
                .build());

        this.materials.add(Material.builder()
                .id(2)
                .name("Ala de Keese")
                .category(categories.findById(3))
                .price(15.4)
                .build());

        this.materials.add(Material.builder()
                .id(3)
                .name("Pimienta ardiente")
                .category(categories.findById(4))
                .price(10.1)
                .build());

        this.materials.add(Material.builder()
                .id(4)
                .name("Manzana Hyliana")
                .category(categories.findById(1L)) // Comida
                .effect(effects.findEffectById(5L)) // Corazones
                .price(4.0)
                .location("Bosques de Hyrule")
                .rarity(rarities.findRarityById(1L)) // Común
                .build());

        this.materials.add(Material.builder()
                .id(5)
                .name("Ámbar")
                .category(categories.findById(2L)) // Mineral
                .effect(effects.findEffectById(2L)) // Defensa
                .price(30.1)
                .location("Montañas de Eldin")
                .rarity(rarities.findRarityById(2L)) // Poco Común
                .build());

        this.materials.add(Material.builder()
                .id(6)
                .name("Cola de Lizalfos")
                .category(categories.findById(3L)) // Parte de Monstruo
                .effect(effects.findEffectById(1L)) // Ataque
                .price(25.4)
                .location("Pantanos de Lanayru")
                .rarity(rarities.findRarityById(2L)) // Poco Común
                .build());

        this.materials.add(Material.builder()
                .id(7)
                .name("Flor Sigilosa")
                .category(categories.findById(4L)) // Planta
                .effect(effects.findEffectById(3L)) // Sigilo
                .price(12.8)
                .location("Bosque Kolog")
                .rarity(rarities.findRarityById(3L)) // Raro
                .build());

        this.materials.add(Material.builder()
                .id(8)
                .name("Trufa Vivaz")
                .category(categories.findById(1L)) // Comida
                .effect(effects.findEffectById(4L)) // Estamina
                .price(60.67)
                .location("Cuevas de Hyrule")
                .rarity(rarities.findRarityById(4L)) // Legendario
                .build());
    }

}
