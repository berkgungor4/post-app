package com.youngadessi.app.post.api;

import com.youngadessi.app.post.dto.CommentCreateDTO;
import com.youngadessi.app.post.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<String> createComment(@RequestBody CommentCreateDTO commentCreateDTO){
        commentService.createComment(commentCreateDTO);
        return new ResponseEntity<>("Comment created successfuly", HttpStatus.OK);
    }
}
