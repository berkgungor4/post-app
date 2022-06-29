package com.youngadessi.app.post.service;

import com.youngadessi.app.post.dto.PostCreateDTO;
import com.youngadessi.app.post.entity.Post;
import com.youngadessi.app.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    public void createPost(PostCreateDTO postCreateDTO) {

        Post post=new Post();
        post.setTitle(postCreateDTO.getTitle());
        post.setContent(postCreateDTO.getContent());
        postRepository.save(post);

    }
}
