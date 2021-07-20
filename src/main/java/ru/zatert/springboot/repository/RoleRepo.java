package ru.zatert.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zatert.springboot.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
}