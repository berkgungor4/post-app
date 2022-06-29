package com.youngadessi.app.user.repository;

import com.youngadessi.app.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByFullnameContainsIgnoreCase(String searchKeyword);
}
