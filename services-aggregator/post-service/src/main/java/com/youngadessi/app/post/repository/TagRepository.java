package com.youngadessi.app.post.repository;

import com.youngadessi.app.post.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
