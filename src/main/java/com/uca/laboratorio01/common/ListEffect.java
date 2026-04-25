package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Effect;

import java.util.ArrayList;
import java.util.List;

public class ListEffect {
    private final List<Effect> effects;

    public ListEffect() {
        this.effects = new ArrayList<>();

        this.effects.add(Effect.builder()
                .id(1)
                .name("Ataque")
                .build());

        this.effects.add(Effect.builder()
                .id(2)
                .name("Defensa")
                .build());

        this.effects.add(Effect.builder()
                .id(3)
                .name("Sigilo")
                .build());

        this.effects.add(Effect.builder()
                .id(4)
                .name("Estamina")
                .build());

        this.effects.add(Effect.builder()
                .id(5)
                .name("Corazones")
                .build());
    }

    public List<Effect> getEffects() {
        return effects;
    }
}
