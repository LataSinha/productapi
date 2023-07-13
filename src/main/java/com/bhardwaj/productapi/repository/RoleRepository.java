package com.bhardwaj.productapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhardwaj.productapi.entity.*;
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
    Optional<RoleEntity> findByName(String name);
}
