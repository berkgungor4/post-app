package com.youngadessi.app.post.mappers;

import com.youngadessi.app.post.dto.PostCreateDTO;
import com.youngadessi.app.post.entity.Post;
import org.mapstruct.Mapper;

@Mapper
public interface PostMapper {
    Post postCreateDTOTOPost(PostCreateDTO postCreateDTO);
}
