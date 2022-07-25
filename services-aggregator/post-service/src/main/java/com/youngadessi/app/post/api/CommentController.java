package com.youngadessi.app.post.api;

import com.youngadessi.app.post.dto.CommentCreateDTO;
import com.youngadessi.app.post.service.CommentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    @Tag(name = "v1 - CMS Post API", description = "Maintain CMS Post API")
    @Operation(
            summary = "Upsert Post Language",
            description = "Upsert Post Language"
    )
    @ApiResponses(
            value = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "OK.",
                            content = @Content(schema = @Schema(implementation = Void.class))),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Bad Request."),
                    @ApiResponse(
                            responseCode = "401",
                            description = "Unauthorized."),
                    @ApiResponse(
                            responseCode = "403",
                            description = "Forbidden."),
                    @ApiResponse(
                            responseCode = "412",
                            description = "Precondition failed."),
                    @ApiResponse(
                            responseCode = "500",
                            description = "Internal server error.",
                            content = @Content(schema = @Schema(implementation = Void.class)))
            }
    )

    @PostMapping
    public ResponseEntity<String> createComment(@RequestBody CommentCreateDTO commentCreateDTO){
        commentService.createComment(commentCreateDTO);
        return new ResponseEntity<>("Comment created successfuly", HttpStatus.OK);
    }
}
