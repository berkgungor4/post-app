package com.youngadessi.app.post.service;

import com.youngadessi.app.post.dto.CommentCreateDTO;
import com.youngadessi.app.post.entity.Comment;
import com.youngadessi.app.post.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    public void createComment(CommentCreateDTO commentCreateDTO) {

        Comment comment=new Comment();
        comment.setCommentText(commentCreateDTO.getCommentText());
        commentRepository.save(comment);
    }
}
