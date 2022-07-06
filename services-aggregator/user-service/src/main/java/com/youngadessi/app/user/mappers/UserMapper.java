package com.youngadessi.app.user.mappers;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.dto.UserReadDTO;
import com.youngadessi.app.user.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    User userCreateDTOTOPost(UserCreateDTO userCreateDTO);
    User userReadDTOTOPost(UserReadDTO userReadDTO);
}
