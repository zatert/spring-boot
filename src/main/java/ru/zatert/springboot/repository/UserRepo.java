package ru.zatert.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.zatert.springboot.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    // распарсит имя пользователя и с помощью магии найдет его
    User findByUsername(String username);
}