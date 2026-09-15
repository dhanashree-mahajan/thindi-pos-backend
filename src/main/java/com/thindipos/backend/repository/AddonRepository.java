package com.thindipos.backend.repository;

import com.thindipos.backend.entity.Addon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddonRepository extends JpaRepository<Addon, Long> {
}