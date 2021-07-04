package ru.zatert.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.zatert.springboot.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    // распарсит имя пользователя и с помощью магии найдет его
    User findByUsername(String username);
}