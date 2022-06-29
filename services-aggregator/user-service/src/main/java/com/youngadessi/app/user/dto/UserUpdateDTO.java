package com.youngadessi.app.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDTO {

    private Long id;

    private String fullname;

    private String password;

    private String email;
}
