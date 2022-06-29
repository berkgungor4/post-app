package com.youngadessi.app.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserReadDTO {

    private Long id;

    private String fullname;

    private String username;

    private String email;
}
