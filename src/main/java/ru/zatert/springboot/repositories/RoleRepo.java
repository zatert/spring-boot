package ru.zatert.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zatert.springboot.entities.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}