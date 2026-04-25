package com.uca.laboratorio01.repositories;

import com.uca.laboratorio01.common.ListEffect;
import com.uca.laboratorio01.domain.model.Effect;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class EffectRepository {
    private final ListEffect listEffect;

    public List<Effect> findAll() {
        return listEffect.getEffects();
    }
}
