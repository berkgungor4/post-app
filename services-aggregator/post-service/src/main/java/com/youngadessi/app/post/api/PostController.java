package com.youngadessi.app.post.api;

import com.youngadessi.app.post.dto.PostCreateDTO;
import com.youngadessi.app.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<String> createPost(@RequestBody PostCreateDTO postCreateDTO) {
        System.out.println(postCreateDTO);
        postService.createPost(postCreateDTO);
        return new ResponseEntity<>("Post created succesfully", HttpStatus.OK);
    }
}
