package com.youngadessi.app.post.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentCreateDTO {

    private String commentText;

    private PostCreateDTO postCreateDto;
}
