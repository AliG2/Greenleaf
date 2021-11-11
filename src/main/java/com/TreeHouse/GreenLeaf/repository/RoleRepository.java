package com.TreeHouse.GreenLeaf.repository;

import com.TreeHouse.GreenLeaf.model.ERole;
import com.TreeHouse.GreenLeaf.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Optional<Role> findByName(ERole name);
}
