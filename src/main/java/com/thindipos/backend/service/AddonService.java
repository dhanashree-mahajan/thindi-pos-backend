package com.thindipos.backend.service;

import com.thindipos.backend.entity.Addon;
import com.thindipos.backend.repository.AddonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddonService {

    private final AddonRepository addonRepository;

    public AddonService(AddonRepository addonRepository) {
        this.addonRepository = addonRepository;
    }

    public Addon saveAddon(Addon addon) {
        return addonRepository.save(addon);
    }

    public List<Addon> getAllAddons() {
        return addonRepository.findAll();
    }

    public Optional<Addon> getAddonById(Long id) {
        return addonRepository.findById(id);
    }

    public void deleteAddon(Long id) {
        addonRepository.deleteById(id);
    }
}