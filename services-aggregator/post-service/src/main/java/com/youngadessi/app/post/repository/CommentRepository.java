package com.youngadessi.app.post.repository;

import com.youngadessi.app.post.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
