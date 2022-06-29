package com.youngadessi.app.post.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PostCreateDTO {

    private String title;

    private String content;

    private List<CommentCreateDTO> commentCreateDTOS;

    private List<TagFetchDTO> tagFetchDTOS;
}
