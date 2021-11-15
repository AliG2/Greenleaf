package com.TreeHouse.GreenLeaf.repository;

import java.util.Optional;

import com.TreeHouse.GreenLeaf.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// hämtar och hanterar data från databas
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // egna metoder till repossitoryt
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
