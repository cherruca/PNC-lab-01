package com.uca.laboratorio01.services;

import com.uca.laboratorio01.domain.model.Effect;
import com.uca.laboratorio01.repositories.EffectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EffectService {
    private final EffectRepository effectRepository;

    public List<Effect> getAllEffects() {
        return effectRepository.findAll();
    }
}
