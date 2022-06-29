package com.youngadessi.app.user.service;

import com.youngadessi.app.user.dto.UserCreateDTO;
import com.youngadessi.app.user.dto.UserReadDTO;
import com.youngadessi.app.user.dto.UserUpdateDTO;
import com.youngadessi.app.user.entity.User;
import com.youngadessi.app.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public void createUser(UserCreateDTO userCreateDTO) {

        //mapstruct ???
        User user=new User();
        user.setEmail(userCreateDTO.getEmail());
        user.setFullname(userCreateDTO.getFullname());
        user.setPassword(userCreateDTO.getPassword());
        user.setUsername(userCreateDTO.getUsername());

        userRepository.save(user);

    }

    public void updateUser(UserUpdateDTO userUpdateDTO){

        Optional<User> optionalUser = userRepository.findById(userUpdateDTO.getId());

        User user = optionalUser.orElseThrow(()->new RuntimeException("User object with id "+userUpdateDTO.getId()+" not found on database"));

        user.setPassword(userUpdateDTO.getPassword());
        user.setEmail(userUpdateDTO.getEmail());
        user.setFullname(userUpdateDTO.getFullname());

        userRepository.save(user);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }

    public List<UserReadDTO> searchUser(String searchKeyword) {

        List<User> userList = userRepository.findByFullnameContainsIgnoreCase(searchKeyword);

        List<UserReadDTO> userReadDTOList=new ArrayList<>();

        for (User user : userList) {

            UserReadDTO userReadDTO=new UserReadDTO();
            userReadDTO.setId(user.getId());
            userReadDTO.setFullname(user.getFullname());
            userReadDTO.setUsername(user.getUsername());
            userReadDTO.setEmail(user.getEmail());

            userReadDTOList.add(userReadDTO);

        }

        return userReadDTOList;
    }

}
