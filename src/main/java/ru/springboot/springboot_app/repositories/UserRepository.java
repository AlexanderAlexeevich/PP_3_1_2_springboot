package ru.springboot.springboot_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.springboot.springboot_app.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
