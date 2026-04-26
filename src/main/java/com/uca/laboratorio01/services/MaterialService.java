package com.uca.laboratorio01.services;

import com.uca.laboratorio01.domain.model.Material;
import com.uca.laboratorio01.repositories.MaterialRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MaterialService {
    private final MaterialRepository materialRepository;

    // Obtener todos los materiales ordenados de mayor a menor precio, para que Link sepa qué vender primero cuando necesite Rupias.
    public List<Material> getAllMaterials() {

        return materialRepository.findAll()
                .stream()
                .sorted((m1, m2) -> Double.compare(m2.getPrice(), m1.getPrice()))
                .toList();

    }

    // Obtener el material más caro del catálogo completo.
    public Material getMostExpensive() {
        return materialRepository.findAll()
                .stream()
                .max(Comparator.comparing(Material::getPrice))
                .orElse(null);
    }

    // Obtener todos los materiales cuyo grado de rareza sea Legendario.
    public List<Material> getLegendaries() {
        return materialRepository.findAll()
                .stream()
                .filter(material -> material.getRarity().getId().equals(4L))
                .toList();
    }
}
