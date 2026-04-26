package com.uca.laboratorio01.common;

import com.uca.laboratorio01.domain.model.Effect;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ListEffect {
    private final List<Effect> effects;

    public ListEffect() {
        this.effects = new ArrayList<>();

        this.effects.add(Effect.builder()
                .id(1L)
                .name("Ataque")
                .build());

        this.effects.add(Effect.builder()
                .id(2L)
                .name("Defensa")
                .build());

        this.effects.add(Effect.builder()
                .id(3L)
                .name("Sigilo")
                .build());

        this.effects.add(Effect.builder()
                .id(4L)
                .name("Estamina")
                .build());

        this.effects.add(Effect.builder()
                .id(5L)
                .name("Corazones")
                .build());
    }

    public List<Effect> getEffects() {
        return effects;
    }

    public Effect getEffectById(long id) {
        return effects.stream().filter(
                effect -> effect.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
