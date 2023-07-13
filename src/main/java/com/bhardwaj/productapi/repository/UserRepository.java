package com.bhardwaj.productapi.repository;

import com.bhardwaj.productapi.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> findByEmail(String username);
    Boolean existsByEmail(String email);
}
