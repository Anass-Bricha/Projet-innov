package org.health.project.repositories;

import org.health.project.entites.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser,Long>{
    AppUser findByUsername(String username);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);
    Optional<AppUser> findAppUserByUsername(String username);
}
