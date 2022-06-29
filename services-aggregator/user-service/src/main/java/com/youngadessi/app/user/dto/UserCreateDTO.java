package com.youngadessi.app.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDTO {

    private String fullname;

    private String username;

    private String password;

    private String email;
}
