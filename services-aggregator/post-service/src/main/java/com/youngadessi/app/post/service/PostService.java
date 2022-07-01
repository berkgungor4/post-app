package com.youngadessi.app.post.service;

import com.youngadessi.app.post.dto.PostCreateDTO;
import com.youngadessi.app.post.entity.Post;
import com.youngadessi.app.post.mappers.PostMapper;
import com.youngadessi.app.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    private final PostMapper postMapper = Mappers.getMapper(PostMapper.class);
    public void createPost(PostCreateDTO postCreateDTO) {

        Post post=postMapper.postCreateDTOTOPost(postCreateDTO);
        postRepository.save(post);

    }
}
