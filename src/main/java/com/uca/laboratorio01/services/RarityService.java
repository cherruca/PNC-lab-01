package com.uca.laboratorio01.services;

import com.uca.laboratorio01.domain.model.Rarity;
import com.uca.laboratorio01.repositories.RarityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RarityService {
    private final RarityRepository rarityRepository;

    public List<Rarity> getAllRarities() {
        return rarityRepository.findAll();
    }
}
