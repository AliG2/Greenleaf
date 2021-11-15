package com.TreeHouse.GreenLeaf.repository;

import com.TreeHouse.GreenLeaf.model.ERole;
import com.TreeHouse.GreenLeaf.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// hämtar och hanterar data från databas
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    // egen metod för att hämta efter role namn
    Optional<Role> findByName(ERole name);
}
